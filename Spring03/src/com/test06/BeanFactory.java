package com.test06;

public class BeanFactory {
	
	//Object의 class의 멤버들은 모든 클래스에서 사용이 가능하다.
	Object getBean(String beanName) {

		if (beanName.equals("samsong")) {

			return new SamsongTV();

		} else if (beanName.equals("ig")) {

			return new IgTV();
		}

		return null;
	}
}
