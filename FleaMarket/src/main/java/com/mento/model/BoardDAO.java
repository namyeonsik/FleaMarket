package com.mento.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("boarddao")
public class BoardDAO implements BoardDAOInterface{

	@Autowired
	SqlSession session;
	
	@Override
	public List<BoardDTO> selectBycategory(String category) {
		return session.selectList("flea.board.selectBycategory", category);
	}
	
	@Override
	public BoardDTO selectBybid(int bid) {
		return session.selectOne("flea.board.selectBybid", bid);
	}

}
