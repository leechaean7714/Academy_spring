package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		Developer hong = (Developer)factory.getBean("honggd");
		Engineer lee = factory.getBean("leess",Engineer.class);
		
		System.out.println(hong);
		System.out.println(lee);
		//emp를 안쓴 이유:emp 상속받지 않음
		//Emp hong = (Emp)factory.getBean("hong");
		//System.out.println(hong);
		
	}

}
