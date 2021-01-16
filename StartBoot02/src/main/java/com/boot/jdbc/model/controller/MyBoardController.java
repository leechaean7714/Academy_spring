package com.boot.jdbc.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jdbc.model.biz.MyBiz;
import com.boot.jdbc.model.dto.MyDto;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {

	@Autowired
	private MyBiz myBiz;

	@GetMapping("/list")
	public String selectList(Model model) {

		model.addAttribute("list", myBiz.selectLIst());

		return "myboardlist";
	}

	@RequestMapping("/insertform")
	public String insert() {

		return "insertform";
	}

	@PostMapping("/insertres")
	public String insertRes(MyDto dto) {

		int res = myBiz.insert(dto);

		if (res > 0) {

			return "redirect:list";
		} else {
			return "redirect:insertform";
		}

	}

	@RequestMapping("/detail")
	public String selectOne(int myno, Model model) {

		model.addAttribute("dto", myBiz.selectOne(myno));

		return "detail";
	}

	@RequestMapping("/updateform")
	public String updateForm(Model model, int myno) {

		model.addAttribute("dto", myBiz.selectOne(myno));

		return "updateform";
	}

	@PostMapping("/updateres")
	public String updateRes(MyDto dto) {

		int res = myBiz.update(dto);
		if (res > 0) {
			return "redirect:detail?myno=" + dto.getMyno();

		} else {

			return "redirect:updateform?myno=" + dto.getMyno();
		}
	}

	@GetMapping("/delete")
	public String delete(int myno) {

		int res = myBiz.delete(myno);

		if (res > 0) {

			return "redirect:list";
		} else {
			return "redirect:detail";
		}

	}
}
