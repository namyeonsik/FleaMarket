package com.mento.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mento.model.MemberDTO;

@Component("memberdao")
public class MemberDAO implements MemberDAOInterface{
	@Autowired
	SqlSession session;
	
	public int insertMembers(MemberDTO member) {
		return session.insert("flea.member.insertMember", member);
	}
	

	public MemberDTO selectByUser(String mid, String mpwd) {
		MemberDTO member = null;
		Map<String, String> map = new HashMap<String, String>();
		map.put("mid", mid);
		map.put("pwd", mpwd);
		member = session.selectOne("flea.member.selectByUser", map);
		return member;
	}
}
