package com.kumar.helper;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelperService {
	
	@Before("execution(void com.codewithheeren.service.WithdrawAmount.withdrawal())") 
	public void authentication()
	{
		System.out.println("authentication functionality get execute.");
	}
	
	@Before("execution(void com.codewithheeren.service.WithdrawAmount.withdrawal())")
	public void logging()    //advice
	{
		System.out.println("logging functionality get execute.");
	}
	@Before("execution(* *Transaction())")
	public void transaction()
	{
		System.out.println("transaction cross cutting functionality get execute.");
	}
	
}
