package com.kumar.helper;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelperService {
	@Before("customPointcut()")
	public void logging()    //advice
	{
		System.out.println("logging functionality get execute.");
	}
	
	@Before("customPointcut()") 
	public void authentication()
	{
		System.out.println("authentication functionality get execute.");
	}
	
	@After("customPointcut()")
	public void transaction()
	{
		System.out.println("transaction functionality get execute.");
	}
	
	@Pointcut("execution(* *Transaction())")  //pointcut expression
	public void customPointcut()
	{
		
	}
}