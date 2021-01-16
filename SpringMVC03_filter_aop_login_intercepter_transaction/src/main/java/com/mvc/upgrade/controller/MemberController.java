
package com.mvc.upgrade.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;

@Controller
public class MemberController {

	// class clazz(클래스를 나타내는 변수)
	private Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberBiz biz;

	@RequestMapping("/loginform.do")
	public String loginForm() {

		logger.info("login form");

		return "mvclogin";
	}

	// 자바 객체를 json으로 바꿔준다. jsonw.// 자바 객체를 제이슨으로 reponse
	@RequestMapping(value = "/ajaxlogin.do", method = RequestMethod.POST)
	@ResponseBody // 뷰리솔브를 통하ㅣㅈ 않고 msg바로 리스펀스 // //여기서 담아준다.제이슨형태의 객체contentType
	public Map<String, Boolean> ajaxLogin(HttpSession session, @RequestBody MemberDto dto) {
		logger.info("ajaxlogin");

		// @RequestBody :request 객체에 담겨져 넘어오는 데이터를 java객체에 binding--/dto에 넣은 json
		// @ResponseBody:java 객체를 response 객체에 binding
		MemberDto res = biz.login(dto);

		boolean check = false;

		if (res != null) {

			session.setAttribute("login", res);

			check = true;

		}

		Map<String, Boolean> map = new HashMap<String, Boolean>();

		map.put("check", check);

		return map;

	}

	@RequestMapping("registform.do")
	public String registFom() {

		return "mvcregist";
	}

	@RequestMapping(value = "registres.do", method = RequestMethod.POST)
	public String registRes(MemberDto dto) {

		int res = biz.insertUser(dto);

		if (res > 0) {

			return "redirect:loginform.do";
		} else {

			return "redirect:registform.do";
		}

	}

}
