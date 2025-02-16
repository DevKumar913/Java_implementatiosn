package com.kumar.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kumar.service.DepositeAmount;
import com.kumar.service.WithdrawAmount;

public class StartApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.kumar.main.AppConfig.class);
		WithdrawAmount amount = (WithdrawAmount) context.getBean("withdrawAmount");
		amount.withdrawalTransaction();
		System.out.println();
		amount.withdrawal();
		
		System.out.println();
		
		DepositeAmount depositeAmount = (DepositeAmount) context.getBean("depositeAmount");
		depositeAmount.depositeTransaction();
	}
}
