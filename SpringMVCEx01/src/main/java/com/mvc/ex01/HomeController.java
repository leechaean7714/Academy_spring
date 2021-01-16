package com.mvc.ex01;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.ex01.model.biz.MyBiz;
import com.mvc.ex01.model.dto.MyDto;

@Controller
public class HomeController {

	@Autowired
	private MyBiz biz;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping("/list.do")
	public String selectList(Model model) {
		logger.info("selectList");

		model.addAttribute("list", biz.selectList());

		return "mvclist";
	}

	@RequestMapping("/detail.do")
	public String selectOne(int seq, Model model) {
		logger.info("selectOne");
		model.addAttribute("dto", biz.selectOne(seq));

		return "mvcdetail";
	}

	@RequestMapping(value = "/updateform.do")
	public String updateForm(int seq, Model model) {
		logger.info("updateform");

		model.addAttribute("dto", biz.selectOne(seq));

		return "mvcupdate";
	}

	@RequestMapping(value = "/updateres.do", method = RequestMethod.POST)
	public String updateRes(Model model, MyDto dto) {
		logger.info("updateres");

		int res = biz.update(dto);

		if (res > 0) {
			return "redirect:detail.do?seq=" + dto.getSeq();
		} else {
			return "redirect:updateform.do?seq=" + dto.getSeq();
		}

	}

	@RequestMapping("/insertform.do")
	public String insertForm() {
		logger.info("insert form");

		return "mvcinsert";
	}

	@RequestMapping(value = "/insertres.do", method = RequestMethod.POST)
	public String insertRes(MyDto dto) {

		int res = biz.insert(dto);

		if (res > 0) {
			return "redirect:list.do";
		} else {
			return "redirect:insertform.do";
		}
	}

	@RequestMapping("delete.do")
	public String delete(int seq,MyDto dto) {

		logger.info("delete");
		int res = biz.delete(seq);
		if (res > 0) {
			return "redirect:list.do";
		} else {
			return "redirect:detail.do?seq="+dto.getSeq();
		}
	}
}
