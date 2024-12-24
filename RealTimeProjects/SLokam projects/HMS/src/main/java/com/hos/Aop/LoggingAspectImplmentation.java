package com.hos.Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.hos.controller.patientcontroller;



@Aspect
@Component

public class LoggingAspectImplmentation {

	private static final Logger log = LoggerFactory.getLogger(LoggingAspectImplmentation.class);
	
	
	@Before("execution(* com.hos.*.*.*(..))")
	public void BeforeAspect(JoinPoint jp)
	{
	
		String cname = jp.getTarget().toString();
	String mname =	jp.getSignature().getName();
	
	log.debug("Aspect call started in the class---"+cname+"--and method name ==="+mname);

		log.info("Aspect call started in the class---"+cname+"--and method name ==="+mname);

	
	}
	
	
	@After("execution(* com.hos.*.*.*(..))")
	public void AfterAspect(JoinPoint jp)
	{
		String cname = jp.getTarget().toString();
		String mname =	jp.getSignature().getName();
		
		log.debug("Aspect call completed in the class---"+cname+"--and method name ==="+mname);

		log.info("Aspect call completed in the class---"+cname+"--and method name ==="+mname);

	}
	
	
	
	
	
	
}
