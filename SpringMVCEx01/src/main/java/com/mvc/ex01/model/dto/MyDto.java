package com.mvc.ex01.model.dto;

import java.util.Date;

public class MyDto {
	
	private int seq;
	private String name;
	private String title;
	private String content;
	private Date mydate;
	
	public MyDto() {}
	
	public MyDto(int seq, String name, String title, String content, Date mydate) {
		
		this.seq=seq;
		this.name=name;
		this.title=title;
		this.content=content;
		this.mydate=mydate;
		
		
		
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMydate() {
		return mydate;
	}

	public void setMydate(Date mydate) {
		this.mydate = mydate;
	}
	
	

}
