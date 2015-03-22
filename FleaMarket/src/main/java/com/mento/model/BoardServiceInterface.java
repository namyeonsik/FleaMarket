package com.mento.model;

import java.util.List;

public interface BoardServiceInterface {
	public List<BoardDTO> selectBycategory(String category);
}
