package com.mento.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("boardservice")
public class BoardService implements BoardServiceInterface{

	@Autowired
	public BoardDAOInterface dao;
	
	@Override
	public List<BoardDTO> selectBycategory(String category) {
		return dao.selectBycategory(category);
	}
	
	@Override
	public BoardDTO selectBybid(int bid) {
		return dao.selectBybid(bid);
	}

}
