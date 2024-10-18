package com.kumar.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kumar.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/kumar/common/Application-context.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}

}
