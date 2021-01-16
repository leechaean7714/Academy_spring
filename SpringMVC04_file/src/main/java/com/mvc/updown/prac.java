package com.mvc.updown;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
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
		if(result.hasErrors()) {
			return "upload";
		}
		
		MultipartFile file = uploadFile.getMpfile();
		String name =file.getOriginalFilename();
		
		UploadFile fileObj = new UploadFile();
		fileObj.setName(name);
		fileObj.setDesc(uploadFile.getDesc());
		
		model.addAttribute("fileObj", fileObj);
		
		
		
		InputStream inputstream = null;
		OutputStream outputstream = null;
		
		try {
			inputstream=file.getInputStream();
			
			String path=WebUtils.getRealPath(request.getSession().getServletContext(), "resources/storage");
			File storage =new File(path);
			if(!storage.exists()) {
				storage.mkdir();
			}
			
			File newFile = new File(path+"/"+name);
			if(!newFile.exists()) {
				newFile.createNewFile();
				
			}
			
			outputstream =new FileOutputStream(newFile);
			int read = 0;
			byte[] b = new byte[(int)file.getSize()];
			
			while((read=inputstream.read(b))!=-1) {
				 outputstream.write(b, 0, read);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "download";
		
	}

	public byte[] fileDownload(HttpServletRequest  request, HttpServletResponse response, String name) {
		
		byte[] down=null;
		String path;
		try {
			path=WebUtils.getRealPath(request.getSession()
					.getServletContext(), "resources/storage");
			
			File file = new File(path);
			down = FileCopyUtils.copyToByteArray(file);
			
			String filename=new String(file.getName().getBytes(),"8859_1");
			response.setHeader("Content-Disposition", "attachment;filename=\""+filename+"\"");
			response.setContentLength(down.length);
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return null;
	
		
	}

}
