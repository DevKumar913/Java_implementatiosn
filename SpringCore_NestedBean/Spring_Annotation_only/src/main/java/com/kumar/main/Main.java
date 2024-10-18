package com.kumar.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.kumar.model.Employee;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.kumar.common.ApplicationConfig.class);
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
	}

}
