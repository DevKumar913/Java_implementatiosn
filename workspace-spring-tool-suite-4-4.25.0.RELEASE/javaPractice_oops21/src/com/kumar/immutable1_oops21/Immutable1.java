/**
 * Emmutable class implementation.
 * Rules to Create immutable class -
 * Class must be final 
 * Class data members must be private and final .
 * Do not define any setter method in that class.
 * Data members must initialize using constructor only.
 */
package com.kumar.immutable1_oops21;


final class Person{
	private final String firstName;
	private final String lastName;
	private final int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName=lastName;
		this.age = age;
	
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "First Name : "+firstName+" Last Name : "+lastName+" Age in years : "+age;
		
	}
}
public class Immutable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
