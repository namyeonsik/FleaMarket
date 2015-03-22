package com.mento.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mento.model.MemberDTO;
import com.mento.model.MemberDAOInterface;


@Component("memberservice")
public class MemberService implements MemberServiceInterface{
	
	@Autowired
	public MemberDAOInterface dao;
	
	public int insertMembers(MemberDTO member) {
		return dao.insertMembers(member);
	}

	public MemberDTO selectByUser(String mid, String pwd) {
		return dao.selectByUser(mid, pwd);
	}

}
