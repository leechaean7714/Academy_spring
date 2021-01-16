package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/app.xml");

		Developer hong = (Developer) factory.getBean("honggd");
		System.out.println(hong);

		Engineer lee = (Engineer) factory.getBean("leess");
		System.out.println(lee);

	}

}
