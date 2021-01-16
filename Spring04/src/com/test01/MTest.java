package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/application.xml");
		
		
		MyClass my = (MyClass)factory.getBean("myClass");
		BeanTest bean = (BeanTest)factory.getBean("beanTest");
		//bean=(BeanTest)factory.getBean("today");
		
		
		//System.out.println(bean);
		//System.out.println(my);
		
	}
}
