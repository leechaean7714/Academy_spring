package com.mvc.upgrade.model.dto;

public class PagingDto {
	
	private int page;
	private int rows;
	private int startpage;
	private int endpage;
	private int totalpage;
	private int pagescale;
	private int pagegroup;
	
	public PagingDto() {}

	public PagingDto(int page, int rows, int startpage, int endpage, int totalpage, int pagescale, int pagegroup) {
		super();
		this.page = page;
		this.rows = rows;
		this.startpage = startpage;
		this.endpage = endpage;
		this.totalpage = totalpage;
		this.pagescale = pagescale;
		this.pagegroup = pagegroup;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
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

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
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
	
	
	

	
}
