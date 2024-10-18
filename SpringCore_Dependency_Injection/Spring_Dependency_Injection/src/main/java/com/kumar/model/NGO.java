package com.kumar.model;

import com.kumar.service.Organization;

public class NGO implements Organization{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NGO [name=" + name + "]";
	}
	

}
