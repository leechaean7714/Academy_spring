package com.mvc.upgrade.model.dao;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.upgrade.model.dto.MemberDto;

@Repository
public class MemeberDaoImpl implements MemberDao {

	@Autowired
	private SqlSessionTemplate sqlsession;
	@Override
	public MemberDto login(MemberDto dto) {
		
		
	
		
		MemberDto res = null;
		
		System.out.println(">"+dto.getMemberid());
		System.out.println(">"+dto.getMemberpw());
		
		try {
			res = sqlsession.selectOne(NAMESPACE+"login", dto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(login):3,4");
		}
				
		
		return res;
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
		
        int res =0;
		
		try {
			res = sqlsession.insert(NAMESPACE+"regist",dto );
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error(regist):3,4");
		}
		
		return res;
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
