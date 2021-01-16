package com.test04;

public class Woman implements Person {

	@Override
	public String classWork() {
	
		System.out.println("컴키고 쇼핑한다.");
		
		return "신발";
	}

}
