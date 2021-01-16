package com.mvc.updown;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.mvc.updown.validate.FileValidator;
import com.mvc.updown.validate.UploadFile;

public class prac {

	private FileValidator fileValidator;

	public String uploadForm() {

		return "upload";
	}

	public String fileUpload(HttpServletRequest request, 
			Model model, UploadFile uploadFile, BindingResult result) {

		fileValidator.validate(uploadFile, result);

		if (result.hasErrors()) {

			return "upload";
		}

		MultipartFile file = uploadFile.getMpfile();
		String name = file.getOriginalFilename();

		UploadFile fileObj = new UploadFile();
		fileObj.setName(name);
		fileObj.setDesc(uploadFile.getDesc());

		InputStream inputstream = null;
		OutputStream outputstream = null;

		
		model.addAttribute("fileObj", fileObj);

		return "download";
		
	}

}
