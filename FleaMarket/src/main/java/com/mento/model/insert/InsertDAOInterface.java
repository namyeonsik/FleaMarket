package com.mento.model.insert;

import com.mento.model.BoardDTO;

public interface InsertDAOInterface {
	public int selectBynextVal();
	public int insertBoard(BoardDTO board);
}
