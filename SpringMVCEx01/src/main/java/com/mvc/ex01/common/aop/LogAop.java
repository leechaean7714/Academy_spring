package com.mvc.ex01.common.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAop {

	public void before(JoinPoint join) {
		
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("--------------------------aop start----------------------------");
		
		Object[] args = join.getArgs();
		
		if(args !=null) {
			logger.info("method:"+join.getSignature().getName());
			for(int i =0;i<args.length;i++) {
				logger.info(i+"번"+args[i]);
			}
			
		}

	}

	public void after(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget().toString());
		logger.info("---------------------------aop end----------------------");
	}

	public void afterThrowing(JoinPoint join) {
		
		Logger logger =LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("---------------------------error--------------------------");
		logger.info("error"+join.getArgs());
		logger.info("error"+join.toString());

	}

}
