package com.doc.comecxception;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LggingAspect {

	@Around("execution(* com.doc.*.*.*(..))")
	public Object adviceMethod(ProceedingJoinPoint pjp) throws Throwable {
	    
		long st = System.currentTimeMillis();
		
		Object obj = null;
		try {
			obj =	pjp.proceed();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	   
		
		long et = System.currentTimeMillis();
		long tk = et-st;
		String mname =	pjp.getSignature().getName();
		String cname = pjp.getTarget().toString();
	        System.out.println(cname+"--tijme taen   method execution"+mname+"---"+tk);
	  
		
		return obj;
	}
	
	
	@Before("execution(* com.doc.*.*.*(..))")
    public void logBeforeMethod(JoinPoint jp) {
	String mname =	jp.getSignature().getName();
	String cname = jp.getTarget().toString();
        System.out.println(cname+"--Logging before method execution"+mname);
    }

    @After("execution(* com.doc.*.*.*(..))")
    public void logAfterReturning(JoinPoint jp) {
    	String mname =	jp.getSignature().getName();
    	String cname = jp.getTarget().toString();
            System.out.println(cname+"--Logging after method execution"+mname);
          }
}
