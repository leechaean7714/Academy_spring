package com.test02;

public class Student {
	
	private String name;
	private String addr;
	private String age;
	
	public Student() {}

	public Student(String name, String addr, String age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름은:" + name + "\t 주소는:" + addr + "\t 나이는:" + age;
	}
	
	

}
