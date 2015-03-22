package com.mento.flea;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mento.model.BoardDTO;
import com.mento.model.BoardServiceInterface;
@Controller
public class ListController {
   
	
	@Autowired
	BoardServiceInterface service;
   
   @RequestMapping(value="/list.do", method=RequestMethod.GET)
   public ModelAndView listGet1(HttpServletRequest request){
      ModelAndView mv = new ModelAndView();
     
//	   	session = request.getSession();
      	String category = request.getParameter("category");
      	
  		List<BoardDTO> boardlist = service.selectBycategory(category);  		
  		//System.out.println(boardlist.size()); 		
  		mv.addObject("boardlist", boardlist); 
  		mv.setViewName("/list");
  		return mv;
      
   }   
}
