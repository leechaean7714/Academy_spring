package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class MTest {
	
public static void main(String[] args) {
		
		
		ApplicationContext factory =  new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		TV samsong= factory.getBean("samsong",TV.class);
		TV ig = (TV)factory.getBean("igTV");
		
		samsong.powerON();
		samsong.powerOff();
		samsong.volumeDowm();
		samsong.volumeUp();
		
		ig.powerON();
		ig.powerOff();
		ig.volumeDowm();
		ig.volumeUp();
		
	}

}
