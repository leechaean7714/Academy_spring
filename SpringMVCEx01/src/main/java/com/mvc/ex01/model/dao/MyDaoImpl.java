package com.mvc.ex01.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.ex01.model.dto.MyDto;

@Repository
public class MyDaoImpl implements MyDao {

	@Autowired
	private SqlSessionTemplate SqlSession;

	@Override
	public List<MyDto> selectList() {

		List<MyDto> list = new ArrayList<MyDto>();

		try {
			list = SqlSession.selectList(NAMESPACE + "selectList");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(selectlist):3,4");
		}
		
		return list;
	}

	@Override
	public MyDto selectOne(int seq) {
		
		MyDto dto = null;
		
		try {
			dto=SqlSession.selectOne(NAMESPACE+"selectOne", seq);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("errer(selectone):3,4");
		}

		return dto;
	}

	@Override
	public int insert(MyDto dto) {

		int res = 0;
		
		try {
			res = SqlSession.insert(NAMESPACE+"insert", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(delete):3,4");
		}
		return res;
	}

	@Override
	public int update(MyDto dto) {
		
		int res = 0;
		
		try {
			
			res = SqlSession.update(NAMESPACE+"update", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(update):3,4");
		}
		
		return res;
	}

	@Override
	public int delete(int seq) {
		
		int res =0;
		
		try {
			res = SqlSession.delete(NAMESPACE+"delete", seq);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(delete):3,4");
		}

		return res;
	}

}
