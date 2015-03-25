package com.mento.flea;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mento.model.MemberDTO;
import com.mento.model.MemberServiceInterface;


@Controller
public class JoinController {
	@Autowired
	MemberServiceInterface service;

	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	public ModelAndView joinGet() {
		ModelAndView mv = new ModelAndView();
		//바꾼부분
		mv.setViewName("/join");
		System.out.println("join get옴");
		return mv;
	}
	
/*	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	public String joinGet() {
		ModelAndView mv = new ModelAndView();
		//바꾼부분
		mv.setViewName("/join");
		System.out.println("join get옴");
		return "redirect:/http://localhost:8080/;
	}*/
	
	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	@Transactional(propagation = Propagation.REQUIRED)
	public ModelAndView joinPost(MemberDTO member, HttpServletRequest request,HttpSession session) {
		System.out.println("왔니!!멤버");
		System.out.println(member);
		ModelAndView mv = new ModelAndView();

		if (member != null) {
			int ret = service.insertMembers(member);
			System.out.println(ret + "건 입력");
			System.out.println(member);
			mv.addObject("joinokmsg", "회원가입이 완료되었습니다.");
			mv.setViewName("/join");
		} else {
			mv.setViewName("/join");
		}
		return mv;
	}
	

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView loginPost(MemberDTO member, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		System.out.println(member);
		System.out.println(member.getMid());
		MemberDTO memcheck = service.selectByUser(member.getMid(),member.getPwd());		

		if (memcheck == null) {
				mv.setViewName("/join");
				mv.addObject("msg", "아이디나 비밀번호를 확인해주세요.");
		}
		 else {
			mv.setViewName("/cate");
			mv.addObject("msg", "아이디나 비밀번호를 확인해주세요.");
		}
		return mv;
	}

}
