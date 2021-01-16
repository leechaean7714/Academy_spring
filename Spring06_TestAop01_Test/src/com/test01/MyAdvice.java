package com.test01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


public class MyAdvice {
	
	
	public MyAdvice() {}
	

	public void beforeSaying(JoinPoint join) {
		
		System.out.println("당신의 이름은 무엇입니까?");
		
	}
	
	public void afterSaying(JoinPoint join) {
		
		System.out.println("이름이 멋지시네요");
		
		
	}
	
	public void afterReturnSaying(JoinPoint join) {
		
		System.out.println("직업이 무엇입니까?");
		
		
	}

}
