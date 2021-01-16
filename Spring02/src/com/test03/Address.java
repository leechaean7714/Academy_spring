package com.test03;

public class Address {
	
	private String name;
	private String addr;
	private String phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//override 사용안하면 변수 주소가 나옴
	@Override
	public String toString() {
		return "Address [이름=" + name + ", 주소=" + addr + ", 전화번호=" + phone + "]";
	}
	
	
 
}
