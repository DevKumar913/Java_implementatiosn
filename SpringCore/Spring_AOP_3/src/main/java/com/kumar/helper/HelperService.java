package com.kumar.helper;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelperService {
	@Before("customPointcut()")
	public void logging(JoinPoint joinPoint)  
	{
		System.out.println("Target method class name : "+ joinPoint.getTarget().getClass());
		System.out.println("Target method signature : "+ joinPoint.getSignature().getName());
		System.out.println("Target proxy class : "+ joinPoint.getThis().getClass());
	}
	
	@Pointcut("execution(* *Transaction())")  //pointcut expression
	public void customPointcut()
	{	
	}
}