package com.mento.flea;


import org.springframework.stereotype.Controller;


@Controller
public class JoinController {
/*
	@Autowired
	MembersServiceInterface service;

	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	public String joinGet() {
		return "/join";
	}

	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	@Transactional(propagation = Propagation.REQUIRED)
	public ModelAndView joinPost(MemberDTO member, HttpServletRequest request,
			HttpSession session) {
		System.out.println("�Դ�!!");
		
		ModelAndView mv = new ModelAndView();

		if (member != null) {
			int ret = service.insertMembers(member);
			System.out.println(ret + "�� �Է�");
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
				mv.addObject("msg", "���̵� ��й�ȣ�� Ȯ�����ּ���.");
			}
		} else {
			mv.setViewName("members/member_main");
			mv.addObject("msg", "���̵� ��й�ȣ�� Ȯ�����ּ���.");
		}
		return mv;
	}*/

}
