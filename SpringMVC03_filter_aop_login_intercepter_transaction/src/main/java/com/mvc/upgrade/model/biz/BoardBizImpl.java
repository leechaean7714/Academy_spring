package com.mvc.upgrade.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.upgrade.model.dao.BoardDao;

import com.mvc.upgrade.model.dto.BoardDto;
import com.mvc.upgrade.model.dto.PagingDto;

@Service
public class BoardBizImpl implements BoardBiz {
	
	@Autowired
	private BoardDao dao;

	@Override
	public List<BoardDto> selectList(PagingDto pdto) {
		
		int page=pdto.getPage();
		int rows=pdto.getRows();
		
		int to= rows*(page-1)+1;
		int from=rows*page;
	

		return dao.selectList(to,from);
	}

	@Override
	public BoardDto selectOne(int myno) {
		
		return dao.selectOne(myno);
	}

	@Override
	public int insert(BoardDto dto) {

		return dao.insert(dto);
	}

	@Override
	public int update(BoardDto dto) {

		return dao.update(dto);
	}

	@Override
	public int delete(int myno) {

		return dao.delete(myno);
	}

	//@Transactional
	public String test() {
		
		//dummy insert
		dao.insert(new BoardDto(1000,"test##################################","t","t",null));
		
		//exception
		String test = dao.test();
		int length=test.length();
		
		return test;
	}

	@Override
	public int totalpage(int rows) {
		
		int totalpage=(int)Math.ceil((double)dao.totalpage()/rows);
		return totalpage;
	}

}