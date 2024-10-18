/*
 * Task 3: Define a class Person with private attributes name and age. 
 * Provide public methods getName(), setName(), getAge(), and setAge() 
 * to access and modify these attributes using association from main class.
 * 
 * 
 */
package com.kumar.Assignments_Task_2;

class Person{
	private String name;
	private int age;
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
	
}

public class Task3 {

	public static void main(String[] args) {
		Person person1= new Person();
		
		
		person1.setName("Robert");
		person1.setAge(24);
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());

	}

}
