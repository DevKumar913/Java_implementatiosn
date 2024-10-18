package com.kumar.model;

import com.kumar.service.Organization;

public class Employee {
	
	private String name;
	private int age;
	private Organization organization;
	
	public Employee(Organization organization) {
		super();
		this.organization = organization;
	}
	public Employee() {
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Organization getOrganization() {
		return organization;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", organization=" + organization + "]";
	}
	
	
	
	

}
