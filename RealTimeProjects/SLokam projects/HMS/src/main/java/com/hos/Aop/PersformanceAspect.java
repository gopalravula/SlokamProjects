package com.hos.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PersformanceAspect {

	private static final Logger log = LoggerFactory.getLogger(PersformanceAspect.class);
	
	@Around("execution(* com.hos.*.*.*(..))")
	public Object AroundMethod(ProceedingJoinPoint pjp) throws  Throwable
	{
		Object obj = null;
		
		
	 try {
		 long starttime = System.currentTimeMillis();
		 
		String cname = pjp.getTarget().toString();
		String mname = pjp.getSignature().getName();
		
		// log.info(cname+"==class inside the method name--"+mname+"==starttime-of method call--"+starttime);
		 obj =	pjp.proceed();
		 
		 long endtime = System.currentTimeMillis();
		 
	//	 log.info(cname+"==class inside the method name--"+mname+"==end time-of method call--"+endtime);
		 log.info(cname+"==class inside the method name--"+mname+"==Total time taken ==--"+(endtime-starttime));
			
	 
	 
	 
	 } catch (Throwable e) {
		System.out.println(e);
	}
		
	 return obj;
	}
}
