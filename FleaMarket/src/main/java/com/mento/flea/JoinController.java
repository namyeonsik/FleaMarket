package com.mento.flea;


import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.mento.model.MemberServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class JoinController {
	@Autowired
	MemberServiceInterface service;

	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	public String joinGet() {
		return "/join";
	}
	/*
	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	@Transactional(propagation = Propagation.REQUIRED)
	public ModelAndView joinPost(MemberDTO member, HttpServletRequest request,
			HttpSession session) {
		System.out.println("왔니!!");
		
		ModelAndView mv = new ModelAndView();

		if (member != null) {
			int ret = service.insertMembers(member);
			System.out.println(ret + "건 입력");
			System.out.println(member);
			mv.setViewName("members/member_main");
		} else {
			mv.setViewName("members/join");
		}
		return mv;
	}

	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView loginPost(MemberDTO member, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		System.out.println(member);
		System.out.println(member.getMid());
		MemberDTO memcheck = service.selectByUser(member.getMid(),
				member.getMpwd());
		

		if (memcheck != null) {
			if (memcheck.getMcheck() == 0) {
				mv.setViewName("members/loginConfirmMain");
				session.setAttribute("memcheck", memcheck);
			} else {
				mv.setViewName("members/member_main");
				mv.addObject("msg", "아이디나 비밀번호를 확인해주세요.");
			}
		} else {
			mv.setViewName("members/member_main");
			mv.addObject("msg", "아이디나 비밀번호를 확인해주세요.");
		}
		return mv;
	}*/

}
