package com.boot.jdbc.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.jdbc.model.dto.MyDto;
import com.boot.jdbc.model.mapper.MyBoardMapper;
@Service
public class MyBizImpl implements MyBiz {
	@Autowired
	private MyBoardMapper myBoaradMapper;

	@Override
	public List<MyDto> selectLIst() {
	
		return myBoaradMapper.selectLIst();
	}

	@Override
	public MyDto selectOne(int myno) {

		return myBoaradMapper.selectOne(myno);
	}

	@Override
	public int insert(MyDto dto) {

		return myBoaradMapper.insert(dto);
	}

	@Override
	public int update(MyDto dto) {
		
		return myBoaradMapper.update(dto);
	}

	@Override
	public int delete(int myno) {

		return myBoaradMapper.delete(myno);
	}

}
