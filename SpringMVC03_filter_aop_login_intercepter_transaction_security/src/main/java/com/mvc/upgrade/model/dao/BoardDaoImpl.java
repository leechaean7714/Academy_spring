package com.mvc.upgrade.model.dao;


import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BoardDto> selectList(int to,int from) {

		List<BoardDto> list = null;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("to", to);
		map.put("from", from);

		try {

			list = sqlSession.selectList(NAMESPACE + "selectList",map);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(selectList):3,4");

		}
		return list;
	}

	@Override
	public BoardDto selectOne(int myno) {

		BoardDto dto = null;
		try {
			dto = sqlSession.selectOne(NAMESPACE + "selectOne", myno);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(selectOne):3,4");

		}

		return dto;
	}

	@Override
	public int insert(BoardDto dto) {
		int res = 0;
		try {
			res = sqlSession.insert(NAMESPACE + "insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(insert):3,4");
		}

		return res;
	}

	@Override
	public int update(BoardDto dto) {
		int res = 0;
		try {
			res = sqlSession.update(NAMESPACE + "update", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(update):3,4");
		}

		return res;
	}

	@Override
	public int delete(int myno) {
		int res = 0;

		try {
			res = sqlSession.delete(NAMESPACE + "delete", myno);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(delete):3,4");
		}

		return res;
	}

	@Override
	public String test() {
		
		return null;
	}

	@Override
	public int totalpage() {
		
		int res = 0;
		
		try {
			res = sqlSession.selectOne(NAMESPACE+"totalpage");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(totalpage3,4):");
		}
		
		return 0;
	}

}
