package com.kumar.StreamAPI_problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person
{
	private String name;
	private int age;
	
    Person(String name, int age) {
		
		this.name = name;
		this.age = age;
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
	
    @Override
    public String toString() {
        return "Person(" + name +", "+ age +")";
    }
	
}

public class Problem3 {

	public static void main(String[] args) {
		List<Person> person = Arrays.asList(
				new Person("John",25),
				new Person("Alice",30),
				new Person("Bob", 25));
		
		  Map<Integer, List<Person>> groupedByAge = person.stream()
				  .collect(Collectors.groupingBy(persons -> persons.getAge()));				
				
				
    System.out.println(groupedByAge);

	}

}