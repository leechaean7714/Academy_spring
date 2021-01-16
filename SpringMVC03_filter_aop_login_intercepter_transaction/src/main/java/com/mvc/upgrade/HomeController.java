package com.mvc.upgrade;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.biz.BoardBizImpl;
import com.mvc.upgrade.model.dto.BoardDto;
import com.mvc.upgrade.model.dto.PagingDto;

@Controller
public class HomeController {
	@Autowired
	private BoardBiz biz;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);// Logger=syso대체

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
	public String selectlist(Model model,HttpServletRequest request, HttpServletResponse response) {

		logger.info("SELECT LIST");
		
		PagingDto pdto = new PagingDto();
		int page=Integer.parseInt(request.getParameter("page"));
		System.out.println("mmmmmmmmmmmmmmmmmmmmm"+page);
		pdto.setRows(10);
		pdto.setPage(page);
		pdto.setPagescale(3);
		pdto.setTotalpage(biz.totalpage(pdto.getRows()));
		// List<BoardDto> list= biz.selectList();
		request.setAttribute("pdto", pdto);
		model.addAttribute("list", biz.selectList(pdto));

		return "mvclist";
	}

	@RequestMapping("/detail.do")
	public String selectOne(Model model, int myno) {

		logger.info("SELECT ONE");

		model.addAttribute("dto", biz.selectOne(myno));

		return "mvcdetail";
	}

	@RequestMapping("/insert.do")
	public String insert() {

		logger.info("INSERT");

		return "mvcinsert";
	}

	@RequestMapping(value = "/insertres.do", method = RequestMethod.POST)
	public String insertRes(BoardDto dto) {
		logger.info("INSERTRES");
		int res = biz.insert(dto);

		if (res > 0) {
			return "redirect:list.do?page=1";
		} else {
			return "redirect:insert.do";
		}

	}

	@RequestMapping("/updateform.do")
	public String updateForm(Model model, int myno) {

		logger.info("UPDATEFORM");

		model.addAttribute("dto", biz.selectOne(myno));

		return "mvcupdate";
	}

	@RequestMapping(value = "/updateres.do", method = RequestMethod.POST)
	public String updateRes(BoardDto dto) {
		logger.info("UPDATERES");
		int res = biz.update(dto);
		if (res > 0) {
			return "redirect:detail.do?myno=" + dto.getMyno();

		} else {

			return "redirect:updateform.do?myno=" + dto.getMyno();
		}

	}

	@RequestMapping("/delete.do")
	public String delete(int myno) {
		logger.info("DELETE");

		BoardDto dto = new BoardDto();

		int res = biz.delete(myno);
		if (res > 0) {

			return "redirect:list.do?page=1";
		} else {
			return "redirect:detail.do?myno=" + dto.getMyno();
		}

	}

	@RequestMapping("/test.do")
	public String test() {
		
		logger.info("TRANSACTION");
		biz.test();
		return "redirect:list.do?page=1";
	}

}
