package com.mvc.updown;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.mvc.updown.validate.FileValidator;
import com.mvc.updown.validate.UploadFile;

@Controller
public class HomeController {

	@Autowired
	private FileValidator fileValidator;

	@RequestMapping("/form")
	public String uploadForm() {

		return "upload";
	}

	@RequestMapping("/upload")
	public String fileUpload(HttpServletRequest request, Model model, UploadFile uploadFile, BindingResult result) {
		// BindingResult 찾아보기:errors(최상위 에러 객체)를 상속 받고 있다
		fileValidator.validate(uploadFile, result);// 유효성 검사 한 것을

		if (result.hasErrors()) {

			return "upload";

		}

		MultipartFile file = uploadFile.getMpfile();// MultipartFile:저장하는 타입
		String name = file.getOriginalFilename();

		UploadFile fileObj = new UploadFile();
		fileObj.setName(name);// setter에 mpfile이 있는데 name에 저장?

		fileObj.setDesc(uploadFile.getDesc());

		InputStream inputStream = null;
		OutputStream outputStream = null;

		try {

			inputStream = file.getInputStream();// ??

			String path = WebUtils.getRealPath(request.getSession().getServletContext(), "/resources/storage");// ??
			System.out.println("업로드 될 실제 경로:" + path);

			File storage = new File(path);// 이경로로 저장
			if (!storage.exists()) {

				storage.mkdir();// 만들어라
			}

			File newFile = new File(path + "/" + name);
			System.out.println("newfile:" + newFile);
			if (!newFile.exists()) {

				newFile.createNewFile();

			}

			outputStream = new FileOutputStream(newFile);

			int read = 0;

			byte[] b = new byte[(int) file.getSize()];

			while ((read = inputStream.read(b)) != -1) {
				outputStream.write(b, 0, read);// 하나하나 읽어서 담는다.
				// write(byte[] b,int off,int len):len 만큼 읽어서 byte[] b의 off위치에 저장하고 읽은 바이트 수를
				// 반환./
			}

		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		model.addAttribute("fileObj", fileObj);

		return "download";
	}

	@RequestMapping("/download")
	@ResponseBody // view 가지 않고 reponse 에 바로
	public byte[] fileDownload(HttpServletRequest request, HttpServletResponse response, String name) {

		byte[] down = null;

		String path;

		try {
			path = WebUtils.getRealPath(request.getSession().getServletContext(), "resources/storage");

			File file = new File(path + "/" + name);
			// System.out.println("File(path+\"/\"+name):"+file);
			down = FileCopyUtils.copyToByteArray(file);// 저장

			String filename = new String(file.getName().getBytes(), "8859_1");// 인코딩을 바꿔준다.

			response.setHeader("Content-Disposition", "attachment;filename=\"" + filename + "\"");// setHeader 파일이 응답된 후
																									// 어떻게 사용되는지 알수
																									// 있다.????????????
			response.setContentLength(down.length);// 다운 로드 됨

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return down;

	}

}
