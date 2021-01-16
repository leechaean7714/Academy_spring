package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class MTest {
	
public static void main(String[] args) {
		
		
		ApplicationContext factory =  new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		System.out.println("ioc container 생성");
		
		TV ig = (TV)factory.getBean("ig");
		//System.out.println(ig); 주소
		ig.powerON();
		ig.powerOff();
		ig.volumeUp();
		ig.volumeDowm();
		
		TV samaong = (TV)factory.getBean("samsong");
		
		
		
		
	}

}
