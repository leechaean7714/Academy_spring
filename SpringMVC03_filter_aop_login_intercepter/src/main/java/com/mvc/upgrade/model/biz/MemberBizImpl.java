package com.mvc.upgrade.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.mvc.upgrade.model.dao.MemberDao;
import com.mvc.upgrade.model.dto.MemberDto;
@Service
public class MemberBizImpl implements MemberBiz {

	@Autowired
	private MemberDao dao;
	@Override
	public MemberDto login(MemberDto dto) {
	
		return dao.login(dto);
	}
	@Override
	public List<MemberDto> selectList() {
		
		return null;
	}
	@Override
	public List<MemberDto> selectEnabled() {
		
		return null;
	}
	@Override
	public int updateRole(int memberno, String memberrole) {
		
		return 0;
	}
	@Override
	public MemberDto idChk(String myid) {
		
		return null;
	}
	@Override
	public int insertUser(MemberDto dto) {
	
		return dao.insertUser(dto);
	}
	@Override
	public MemberDto selectUser(int memberno) {
		
		return null;
	}
	@Override
	public int updateUser(MemberDto dto) {
		
		return 0;
	}
	@Override
	public int deleteUser(int memberno) {
		
		return 0;
	}

}
