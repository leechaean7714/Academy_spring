package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {

		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		
		Emp friend01=(Emp)factory.getBean("friend01");
		Emp friend02=(Emp)factory.getBean("friend02");
		

		System.out.println(friend01);
		System.out.println(friend02);
	}

}
