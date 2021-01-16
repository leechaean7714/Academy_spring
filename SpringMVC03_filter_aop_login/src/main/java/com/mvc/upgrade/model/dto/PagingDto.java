package com.mvc.upgrade.model.dto;

public class PagingDto {
	
	private int rows;//현재페이지 게시글수
	private int page;//현재 페이지
	private int startpage;//1~5에서 1페이지
	private int endpage;//5페이지
	private int pagescale;//페이지 한 그룹을 몇 개의 페이지로 할지
	private int pagegroup;//1~5 는 한그룹
	private int totalpage;//전체게시글 수
	
	public PagingDto(){}
	
	public PagingDto(int rows, int page, int startpage, int endpage, int pagescale, int pagegroup, int totalpage) {
		super();
		this.rows = rows;
		this.page = page;
		this.startpage = startpage;
		this.endpage = endpage;
		this.pagescale = pagescale;
		this.pagegroup = pagegroup;
		this.totalpage = totalpage;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getStartpage() {
		return startpage;
	}

	public void setStartpage(int startpage) {
		this.startpage = startpage;
	}

	public int getEndpage() {
		return endpage;
	}

	public void setEndpage(int endpage) {
		this.endpage = endpage;
	}

	public int getPagescale() {
		return pagescale;
	}

	public void setPagescale(int pagescale) {
		this.pagescale = pagescale;
	}

	public int getPagegroup() {
		return pagegroup;
	}

	public void setPagegroup(int pagegroup) {
		this.pagegroup = pagegroup;
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	
	
	
	

}
