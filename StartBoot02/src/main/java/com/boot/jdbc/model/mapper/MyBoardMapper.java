package com.boot.jdbc.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.boot.jdbc.model.dto.MyDto;

@Mapper
public interface MyBoardMapper {
//mapper xml과 똑같은 역할	
	
	@Select(" SELECT MYNO,MYNAME,MYTITLE,MYCONTENT,MYDATE FROM MYBOARD ORDER BY MYNO DESC ")
	List<MyDto> selectLIst();
	
	@Select(" SELECT MYNO,MYNAME,MYTITLE,MYCONTENT,MYDATE FROM MYBOARD WHERE MYNO =#{myno} ")
	MyDto selectOne(int myno);
	
	@Insert(" INSERT INTO MYBOARD VALUES(MYNOSEQ.NEXTVAl,#{myname},#{mytitle},#{mycontent},SYSDATE) ")
	int insert(MyDto dto);
	
	@Update(" UPDATE MYBOARD SET MYTITLE=#{mytitle} , MYCONTENT=#{mycontent} WHERE MYNO =#{myno} ")
	int update(MyDto dto);
	
	@Delete(" DELETE FROM MYBOARD WHERE MYNO=#{myno} ")
	int delete(int myno);
	
	
	
	

}
