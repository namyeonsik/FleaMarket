package com.mento.model.insert;

import com.mento.model.BoardDTO;

public interface InsertServiceInterface {
	public int selectBynextVal();
	public int insertBoard(BoardDTO board);
	
}
