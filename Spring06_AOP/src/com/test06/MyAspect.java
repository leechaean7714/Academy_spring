package com.test06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class MyAspect {
	
    @Before("execution(public * *(..))")
	public void beforeMethod() {

		System.out.println("출근 카드를 찍는다.");
	}
    @After("execution(public * *(..))")
	public void afterMethod() {

		System.out.println("집에 간다.");
	}

}
