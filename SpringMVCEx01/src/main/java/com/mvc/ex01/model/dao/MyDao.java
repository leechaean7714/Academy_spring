package com.mvc.ex01.model.dao;

import java.util.List;

import com.mvc.ex01.model.dto.MyDto;

public interface MyDao {
	
	String NAMESPACE = "myboard2.";
	
	public List<MyDto> selectList();
	public MyDto selectOne(int seq);
	public int insert(MyDto dto);
	public int update(MyDto dto);
	public int delete(int seq);

}
