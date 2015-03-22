package com.mento.model;

import com.mento.model.MemberDTO;

public interface MemberServiceInterface {
	public int insertMembers(MemberDTO member);

	public MemberDTO selectByUser(String mid, String mpwd);


}
