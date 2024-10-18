package com.kumar_Reflection;

public class Person {
	
	public String name;
	private String nationality;
	protected String bloodGroup;
	public String getName() {
		return name;
	}
	public Person() {
		super();
		
	}
	public Person(String name) {
		super();
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", nationality=" + nationality + ", bloodGroup=" + bloodGroup + "]";
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	private void privateInformation() {
		System.out.println("private information can not accessible outside the class.");
	}
}
