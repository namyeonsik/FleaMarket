package com.mento.model;

import com.mento.model.MemberDTO;

public interface MemberDAOInterface {
	
	public int insertMembers(MemberDTO member);

	public MemberDTO selectByUser(String mid, String pwd);

}
