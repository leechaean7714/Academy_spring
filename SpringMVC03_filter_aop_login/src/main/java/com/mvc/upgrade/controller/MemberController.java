package com.mvc.upgrade.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;

@Controller
public class MemberController {
	
	
	//class clazz(클래스를 나타내는 변수)
	private Logger logger=LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberBiz biz;
	
	
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		
		logger.info("login form");
		
		return"mvclogin";
	}
	
	
	
	@RequestMapping(value = "/ajaxlogin.do",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Boolean> ajaxLogin(HttpSession session,@RequestBody MemberDto dto ) {
		logger.info("ajaxlogin");
		
		//@ResponseBody:java 객체를 reponse 객체레 binding
		//@RequestBody :request 객체에 담겨져 넘어오는 데이터를 java객체에 binding--dto에 넣은 json
		MemberDto res = biz.login(dto);
		
		boolean check = false;
		
		if(res !=null) {
			
			session.setAttribute("login", res);
			check = true;
			
		}
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		
		map.put("check", check);
		
		
		
		return map;
		
	}

}
