package com.kumar.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kumar.model.Company;

@Configuration
@ComponentScan(basePackages="com.kumar")
public class ApplicationConfig {
	
	@Bean
	@Primary
	public Company company1() {
		Company company = new Company();
		company.setName("TCS1-primary");
		company.setAddress("Hyderabad1-primary");
		return company;
	}
	
	@Bean
	public Company company2() {
		Company company = new Company();
		company.setName("TCS2");
		company.setAddress("Hyderabad2");
		return company;
	}
}
