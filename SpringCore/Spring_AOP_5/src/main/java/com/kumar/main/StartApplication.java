package com.kumar.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kumar.service.DepositeAmount;
import com.kumar.service.WithdrawAmount;

public class StartApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.kumar.main.AppConfig.class);
		WithdrawAmount amount = (WithdrawAmount) context.getBean("withdrawAmount");
		double totalAmount = amount.withdrawal(1000);
		System.out.println(totalAmount);
//		DepositeAmount depositeAmount = (DepositeAmount) context.getBean("depositeAmount");
//		int totalBalance = depositeAmount.deposite(1000);
//		System.out.println(totalBalance);
	}
}