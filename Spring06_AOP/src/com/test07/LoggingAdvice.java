package com.test07;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LoggingAdvice implements MethodInterceptor{
     
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
    //지정된 매개 변수를 사용하여 현재 인스턴스로 나타낸 메서드 또는 생성자를 호출합니다.
		
		
		String methodName=invocation.getMethod().getName();
		StopWatch timer = new StopWatch();
		
		timer.start(methodName);
		
		System.out.println("[LOG]METHOD:"+methodName+" is Calling");
		Object obj = invocation.proceed();
		
		timer.stop();
		System.out.println("[LOG]METHOD:"+methodName+" was Calling");
		System.out.println("[LOG]TIME:"+timer.getTotalTimeSeconds()+"sec");
		
		
		return obj;
	}

}
