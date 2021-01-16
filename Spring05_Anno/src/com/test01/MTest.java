package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		MyNickPrn my = (MyNickPrn)factory.getBean("myNickPrn");//해당 클래스명(첫글자는 소문자)
		System.out.println(my);
		
	}

}
