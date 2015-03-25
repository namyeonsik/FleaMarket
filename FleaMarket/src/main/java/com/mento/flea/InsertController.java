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
		/*if(member==null){
			System.out.println("로그인해야함");
			return "join";
		}
		else{
			return "insert";
		}*/
		return "insert";
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String Insert2(BoardDTO board, HttpServletRequest request, HttpSession session){		
		if(board!=null){
		System.out.println(board);
		System.out.println("-0----------------  "
	            + board.getPic().getOriginalFilename());
		}
	      // books과 notice의 noticeno primarykey를 일치시키기 위해 미리 sequence 가져옴
	      // 그림파일 업로드 시 파일명을 primarykey로 일치시
	      int nextval = Insertservice.selectBynextVal();
	      System.out.println("-------------nextval   "+nextval);
	      if (board.getPic() != null) {
	         String path = request.getSession().getServletContext()
	               .getRealPath("/resources/images");
	         CommonsMultipartFile file = board.getPic();
	         String fileName = file.getOriginalFilename();
	         fileName = fileName.substring(fileName.length() - 4,
	               fileName.length());
	        
	         // jpg파일이나 gif 파일만 받음
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
	            System.out.println("jpg or gif 파일 아님");
	         }

	      }

	      
	      //notice.setNoticeNo(nextval);
	      //board.setNoticeNo(nextval);			//board id, 시퀀스로 만들어서 가져오기
	      //notice.setNoticeDate(noticeDate);

//	      String userNick = request.getParameter("userId");
//	      board.setBid(session.getAttribute("memcheck"));	//사용자 아이디 dto에 저장

	      int noticeRet = Insertservice.insertBoard(board); //board 테이블에 등록
	      System.out.println(noticeRet);
	      
		return "redirect:/insert.do";
	}
	
}
