package com.kumar.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kumar.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kumar/common/application-context.xml");
		Employee employee1 = (Employee) context.getBean("employee1");
		System.out.println(employee1);
	}

}
