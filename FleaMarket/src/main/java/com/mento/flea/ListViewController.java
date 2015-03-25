package com.mento.flea;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mento.model.BoardDTO;
import com.mento.model.BoardServiceInterface;
@Controller
public class ListViewController {   
	
	@Autowired
	BoardServiceInterface service;
   
   @RequestMapping(value="/list_view.do", method=RequestMethod.GET)
   public ModelAndView listviewGet1(@RequestParam("bid") int bbid, HttpServletRequest request){
      ModelAndView mv = new ModelAndView();
     
  		BoardDTO boardlist = service.selectBybid(bbid);	

  		mv.addObject("boardlist", boardlist); 
  		mv.setViewName("/list_view");
  		return mv;
      
   }   
}
