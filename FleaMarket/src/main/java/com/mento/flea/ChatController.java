package com.mento.flea;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChatController {
	
	/*@Autowired
	ServiceInterface service;*/
	
	@RequestMapping(value="/chat.do", method=RequestMethod.GET)
	public ModelAndView categoryGet(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		//if(session.getAttribute("memcheck")==null){
		//	mv.setViewName("notmember");
	     //    return mv;
	    //  }else{
			int bid = Integer.parseInt(request.getParameter("bid"));
			mv.addObject("bid", bid); 
	         mv.setViewName("/chat");	         
	        return mv;
	    //  }
	}
	
	
	/*@RequestMapping(value="/cate.do", method=RequestMethod.POST)
	public ModelAndView categoryPost(HttpServletRequest request, HttpSession session){
		if(session.getAttribute("memcheck")==null){
	         ModelAndView mv = new ModelAndView();
	         mv.setViewName("member_slogin");
	         return mv;
	      }else{
	    	  
	      }
	}*/
	
}
