package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");

		Address lee = (Address) factory.getBean("lee");
		Address hong = factory.getBean("hong", Address.class);

		System.out.println(lee);
		System.out.println(hong);

		((ClassPathXmlApplicationContext) factory).close();// factory 누수 방지

	}

}
