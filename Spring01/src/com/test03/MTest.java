package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		// 옛날 방식
		// 1.
		// Resource res = new FileSystemResource(src/com/test03/beans.xml);

		// 2.
		// Resource res = new ClassPathResource(com/test03/beans.xml);
		// BeanFactory factory = new XmlBeanFactory(res);

		// 3.
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		//MessageBean bean = new MessageBeanKo();과 같은 말
		MessageBean bean = (MessageBean) factory.getBean("korean");
		bean.sayHello("스프링");

		bean = (MessageBean) factory.getBean("english");
		bean.sayHello("spring");
	}
}

/*
 * 1.applicationContext 와 classPathApplicationContext
 * 
 * BeanFactory <-ApplicationContext<-ClassPathXmlApplicationContext
 * 
 * 스프링의 ApplicationContext 객체는 스프링 컨테이너(ioc)의 인스턴스이다
 * 스프링은 ApplicationContext의 몇가지 기본 구형을 제공한다.
 * 그중 ClassPathXmlApplicationContext 는 Xml형식의 조립형 어플리케이션에 적합하다.
 * (지정된 classpath 에서 xml(bean) 파일을 읽어서 객체생성)
 * 
 * 2.content,context,container
 * content:기능 , 내용,...
 * context:기능을 구현하기 위한 정보, 설정(설정파일)...
 * container:담는 그릇 //tomcat(서블릿 컨테이너(서버))
 *   springioc container란?
 *   
 */
