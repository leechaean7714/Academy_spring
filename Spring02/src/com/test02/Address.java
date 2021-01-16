package com.test02;

public class Address {
	
	private String name;
	private String addr;
	private String phone;
	
	public Address() {
		
		this.name="leejune";
		this.addr="seoul";
		this.phone="010-000-0000";
	}
	
	public Address(String name, String addr, String phone) {
		this.name=name;
		this.addr=addr;
		this.phone=phone;
	}
	
	public String toString() {
		return "이름:"+name+"\t주소:"+addr+" \t 전화번호:"+phone;
	}

}
