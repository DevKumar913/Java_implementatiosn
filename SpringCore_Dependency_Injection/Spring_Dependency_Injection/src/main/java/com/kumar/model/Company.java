package com.kumar.model;

import com.kumar.service.Organization;

public class Company implements Organization{
	
	private String name;
	private String organizationType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", organizationType=" + organizationType + "]";
	}
	
	

}
