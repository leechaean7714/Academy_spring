package com.mvc.updown.validate;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile {
	
	
	private String name;
	private String desc;
	private MultipartFile mpfile;
	/*
	 * MultipartFile 설명
	 * The file contents are either stored in memory or temporarily on  disk. (파일 내용들은 memory에 저장되거나 일시적으로 disk에 저장된다) 
	 * In either case, the user is responsible for copying file contents to a session-level or persistent store
	 * as and if desired. (하여간 사용자는 session-level 이나 영구저장소에 파일 내용을 복사할 책임이 있다. 만약 희망한다면 )
	 * The temporary storages will be cleared at the end of request  processing. 
	 *(일시적인 저장소들은 깨끗해 질 것이다., 요청처리 마지막에)
	 */
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public MultipartFile getMpfile() {
		return mpfile;
	}
	public void setMpfile(MultipartFile mpfile) {
		this.mpfile = mpfile;
	}
	
	
	

}
