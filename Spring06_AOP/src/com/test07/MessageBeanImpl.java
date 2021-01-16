package com.test07;

public class MessageBeanImpl implements MessageBean {

	private String name;

	public void setName(String name) {

		this.name = name;
	}

	@Override
	public void sayHello() {
		
		try {
			
			Thread.sleep(2000);//지정된 시간 동안 현재 스레드를 일시 중단합니다
			
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		System.out.println("hello " + name);

	}

}
