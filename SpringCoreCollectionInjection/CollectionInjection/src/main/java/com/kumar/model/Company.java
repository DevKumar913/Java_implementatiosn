package com.kumar.model;

import java.util.List;

public class Company {
	
	private List<String> departments;
	
	public Company(List<String> departments) {
		super();
		this.departments=departments;
	}
	public List<String> gerDept(){
		return departments;
	}
	@Override
	public String toString() {
		return "Company [departments=" + departments + "]";
	}

}
