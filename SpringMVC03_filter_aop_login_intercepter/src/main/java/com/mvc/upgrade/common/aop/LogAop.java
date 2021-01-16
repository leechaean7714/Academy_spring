package com.mvc.upgrade.common.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAop {

	public void before(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget() + "");// ""없으면 에러 String
		logger.info("-------------aop start--------------");
			////aop가 적용된 메소드에 전달된 인자를 배열로 얻어내기.
		Object[] args = join.getArgs();
		
		if (args != null) {         //getSignature():호출되는 메소드의 정보를 구함
			logger.info("method:&&&&&&&&&&&" + join.getSignature().getName());
			for (int i = 0; i < args.length; i++) {
				logger.info(i + "번***********" + args[i]);
			}
		}
		
		//join.getTarget()   대상 객체
		//join.getARg        대상 파라미터
		//join.getSignature()   대상 메서드(호출되는 메소드의 정보) 정보
	}

	public void after(JoinPoint join) {
		
		Logger logger = LoggerFactory.getLogger(join.getTarget().toString());
		logger.info("---------------aop end---------------");
		
		

	}

	public void afterThrowing(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("----------------error-----------------");
		logger.info("error:"+join.getArgs());
		logger.info("error:"+join.toString());

	}

}
