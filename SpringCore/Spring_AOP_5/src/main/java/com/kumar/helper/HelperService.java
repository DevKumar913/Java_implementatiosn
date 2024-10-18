package com.kumar.helper;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelperService {
	@Around("execution(public * deposite(..))")
	public int  depositeAdvice(ProceedingJoinPoint joinPoint)  
	{
		System.out.println("depositeAdvice(): HelperService class");
		return 0;
	}
	
	@Around("execution(public * withdrawal(..))")
	public double withdrawalAdvice(ProceedingJoinPoint joinPoint)  
	{
		Object[] args = joinPoint.getArgs();
		args[0] = Integer.parseInt(args[0]+"")+500;
		double tax=2.5,detectedAmount=0;
		try {
			detectedAmount = (Double) joinPoint.proceed(args);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		detectedAmount=detectedAmount+tax;
		return detectedAmount;
	}
}