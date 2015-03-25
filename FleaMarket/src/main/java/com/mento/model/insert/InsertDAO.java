package com.mento.model.insert;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mento.model.BoardDTO;

@Component("Insertdao")
public class InsertDAO implements InsertDAOInterface {

	@Autowired
	SqlSession InsertSession;

	@Override
	public int selectBynextVal() {
		int t = InsertSession.selectOne("fleamarket.insert.selectBynextVal");

		return t;
	}

	@Override
	public int insertBoard(BoardDTO board) {
		int t = InsertSession.insert("fleamarket.insert.insertBoard");
		return t;
	}

}
