/*
 * Task 4: Develop a Java program to process a list of employees. 
 * Use instance methods to calculate their salary based on after 10% of tax 
 * deduction.
 * 
 */

package com.kumar.Assignments_oops1;

import java.util.ArrayList;
import java.util.List;

class Employee{
	private String name;
	private double salary;
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public double calculateSal() {
		double tax =0.10;
		return salary-(salary*tax);
	}
}

public class EmpSalProcess {

	public static void main(String[] args) {
		
		List<Employee> employees= new ArrayList<>();
		
		employees.add(new Employee("Rajesh", 98767.897));
		employees.add(new Employee("Venkatesh", 8877.897));
		employees.add(new Employee("Rahul", 7867.897));
		
		for(Employee emp: employees) {
			double salaryafterdeducation=emp.calculateSal();
			
			System.out.println("Employee Name: "+ emp.getName());
			System.out.println("Employee Salary: "+ emp.getSalary());
			System.out.println("Employee Salary after tax deduction: "+ salaryafterdeducation );
			System.out.println();
		}
	}

}
