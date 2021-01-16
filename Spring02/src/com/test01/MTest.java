package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	
	public static void main(String[] args) {
		
		//bananaBean을 사용해서 sayHello()를 호출하자.
		
	     ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
	     
	     //MessageBean Bean = new MessageBeanImpl(); 과 같은 뜻
	     MessageBean banana = (MessageBean)factory.getBean("banana");
	     
	     banana.sayHello();
	     
	     MessageBean mango = (MessageBean)factory.getBean("mango");
	     mango.sayHello();
	     
	     MessageBean grape = (MessageBean)factory.getBean("grape");
	     grape.sayHello();
		
	}
}
