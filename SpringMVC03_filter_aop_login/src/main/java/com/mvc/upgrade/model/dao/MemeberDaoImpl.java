package com.mvc.upgrade.model.dao;


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

}
