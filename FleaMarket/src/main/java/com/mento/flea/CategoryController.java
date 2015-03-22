package com.mento.flea;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
	
	/*@Autowired
	ServiceInterface service;*/
	
	@RequestMapping(value="/cate.do", method=RequestMethod.GET)
	public ModelAndView categoryGet(){
		ModelAndView mv = new ModelAndView();
		//if(session.getAttribute("memcheck")==null){
		//	mv.setViewName("notmember");
	     //    return mv;
	    //  }else{
	         mv.setViewName("/cate");	         
	        return mv;
	    //  }
	}
	
	
	/*@RequestMapping(value="/cate.do", method=RequestMethod.POST)
	public ModelAndView categoryPost(HttpServletRequest request, HttpSession session){
		if(session.getAttribute("memcheck")==null){
	         ModelAndView mv = new ModelAndView();
	         mv.setViewName("member_login");
	         return mv;
	      }else{
	    	  
	      }
	}*/
	
}
