package com.kumar.helper;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelperService {
	@AfterReturning(pointcut="execution(public * *Transaction())",returning="returnedValue")
	public void logging(int returnedValue)  
	{
		System.out.println("transaction method returned value: "+ returnedValue);
	}
	
	@AfterThrowing(pointcut="execution(public * *Transaction())",throwing="exception")
	public void logging(Exception exception)  
	{
		System.out.println("transaction method throwing exception:------------------ "+ exception);
	}
}