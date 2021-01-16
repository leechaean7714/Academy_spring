package com.test06;

public class MTest {

	
	public static void main(String[] args) {
		
		
		BeanFactory factory = new BeanFactory();
		//TV tv = new SamsongTV(); or TV tv = new IgTV();
		TV tv =(TV)factory.getBean("samsong");
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDowm();
	}
}
