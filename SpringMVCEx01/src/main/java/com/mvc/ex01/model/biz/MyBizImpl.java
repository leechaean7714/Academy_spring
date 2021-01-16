package com.mvc.ex01.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.ex01.model.dao.MyDao;
import com.mvc.ex01.model.dto.MyDto;
@Service
public class MyBizImpl implements MyBiz {
	
	@Autowired
	private MyDao dao;
	@Override
	public List<MyDto> selectList() {
		
		return dao.selectList();
	}

	@Override
	public MyDto selectOne(int seq) {
		
		return dao.selectOne(seq);
	}

	@Override
	public int insert(MyDto dto) {
		
		return dao.insert(dto);
	}

	@Override
	public int update(MyDto dto) {
		
		return dao.update(dto);
	}

	@Override
	public int delete(int seq) {
		
		return dao.delete(seq);
	}

}
