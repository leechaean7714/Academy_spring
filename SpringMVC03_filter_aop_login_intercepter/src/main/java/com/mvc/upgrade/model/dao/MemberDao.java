package com.mvc.upgrade.model.dao;

import java.util.List;

import com.mvc.upgrade.model.dto.MemberDto;

public interface MemberDao {
	
	String NAMESPACE="mymember.";
	
	public MemberDto login(MemberDto dto);
	public List<MemberDto> selectList();
	public List<MemberDto> selectEnabled();
	public int updateRole(int memberno, String memberrole);
	public MemberDto idChk(String myid);
	public int insertUser(MemberDto dto);
	public MemberDto selectUser(int memberno);
	public int updateUser(MemberDto dto);
	public int deleteUser(int memberno);
	

}
