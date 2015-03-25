package com.mento.model;

import java.util.List;

public interface BoardDAOInterface {
	public List<BoardDTO> selectBycategory(String category);
	public BoardDTO selectBybid(int bid);
}
