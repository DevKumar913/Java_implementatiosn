package com.kumar.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kumar.module.Company;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("\\com\\kumar\\common\\Application-context.xml");
		Company company = (Company) context.getBean("company3");
		System.out.println(company);
	}

}
