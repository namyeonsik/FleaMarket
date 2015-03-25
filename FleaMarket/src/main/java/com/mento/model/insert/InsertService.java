package com.mento.model.insert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mento.model.BoardDTO;

@Component("Insertservice")
public class InsertService implements InsertServiceInterface{

	@Autowired
	private InsertDAOInterface Insertdao;
	
	@Override
	public int selectBynextVal() {
		
		return Insertdao.selectBynextVal();
	}

	@Override
	public int insertBoard(BoardDTO board) {
		return Insertdao.insertBoard(board);
	}

}
