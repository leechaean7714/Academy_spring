package com.test02;

public class Mtest {

	
	
	public static void main(String[] args) {
		//messageBean을 messageBeanEn으로 고치면 아래
		//new messageBeanKo가 오류가 난다. 
		MessageBean bean =new MessageBeanEn();
		bean.sayHello("Spring");
		
		bean=new MessageBeanKo();
		bean.sayHello("스프링");
		
	}
}
