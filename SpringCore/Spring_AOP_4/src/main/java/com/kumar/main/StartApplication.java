package com.kumar.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kumar.service.WithdrawAmount;

public class StartApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.kumar.main.AppConfig.class);
		WithdrawAmount amount = (WithdrawAmount) context.getBean("withdrawAmount");
		amount.withdrawalTransaction();
	}
}