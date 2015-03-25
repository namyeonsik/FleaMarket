package com.mento.flea;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.mento.model.BoardDTO;
import com.mento.model.MemberDTO;
import com.mento.model.insert.InsertServiceInterface;


@Controller
public class InsertController {

	@Autowired
	private InsertServiceInterface Insertservice;
	
	@RequestMapping(value="/insert.do", method=RequestMethod.GET)
	public String Insert(HttpSession session){		
		MemberDTO member = (MemberDTO) session.getAttribute("memcheck");
		return "insert";
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String Insert2(BoardDTO board, HttpServletRequest request, HttpSession session){		
		if(board!=null){
		System.out.println(board);
		System.out.println("-0----------------  "
	            + board.getPic().getOriginalFilename());
		}

	      int nextval = Insertservice.selectBynextVal();
	      System.out.println("-------------nextval   "+nextval);
	      if (board.getPic() != null) {
	         String path = request.getSession().getServletContext()
	               .getRealPath("/resources/images");
	         CommonsMultipartFile file = board.getPic();
	         String fileName = file.getOriginalFilename();
	         fileName = fileName.substring(fileName.length() - 4,
	               fileName.length());

	         if (fileName.equals(".jpg") || fileName.equals(".gif")) {
	            board.setImage(nextval + fileName);
	            FileOutputStream fo = null;

	            try {
	               fo = new FileOutputStream(path + "/" + nextval+fileName);
	               fo.write(file.getBytes());
	               fo.close();
	            } catch (FileNotFoundException e) {
	               // TODO Auto-generated catch block
	               e.printStackTrace();
	            } catch (IOException e) {
	               // TODO Auto-generated catch block
	               e.printStackTrace();
	            }
	         }
	         else{
	            System.out.println("jpg or gif ...");
	         }

	      }

	      int noticeRet = Insertservice.insertBoard(board); 
	      System.out.println(noticeRet);
	      
		return "redirect:/insert.do";
	}
	
}
