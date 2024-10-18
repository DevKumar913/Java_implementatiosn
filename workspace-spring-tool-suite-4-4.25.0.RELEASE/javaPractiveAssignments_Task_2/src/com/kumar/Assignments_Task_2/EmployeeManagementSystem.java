/*
 * Employee Management System: Build a system with classes Employee,
 *  Manager, Developer, and Intern. Implement inheritance 
 *  where Manager and Developer inherit from Employee. 
 *  Use method overriding for any specific 
        functionalities.
 */
package com.kumar.Assignments_Task_2;


//Base class Employee
class Employee {
 protected String name;
 protected int id;
 protected double salary;

 // Constructor for Employee
 public Employee(String name, int id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 // Method to display employee details
 public void displayDetails() {
     System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
 }

 // Work method (to be overridden by subclasses)
 public void work() {
     System.out.println(name + " is working.");
 }
}

//Subclass Manager inheriting from Employee
class Manager extends Employee {

 // Constructor for Manager
 public Manager(String name, int id, double salary) {
     super(name, id, salary);  // Calling the Employee constructor
 }

 // Overriding the work method
 @Override
 public void work() {
     System.out.println(name + " is managing the team.");
 }
}

//Subclass Developer inheriting from Employee
class Developer extends Employee {

 // Constructor for Developer
 public Developer(String name, int id, double salary) {
     super(name, id, salary);  // Calling the Employee constructor
 }

 // Overriding the work method
 @Override
 public void work() {
     System.out.println(name + " is writing code.");
 }
}

//Subclass Intern inheriting from Employee
class Intern extends Employee {

 // Constructor for Intern
 public Intern(String name, int id, double salary) {
     super(name, id, salary);  // Calling the Employee constructor
 }

 // Overriding the work method
 @Override
 public void work() {
     System.out.println(name + " is learning and assisting the team.");
 }
}

//Main class to test the Employee Management System
public class EmployeeManagementSystem {

 public static void main(String[] args) {
     // Creating objects of Manager, Developer, and Intern
     Manager manager = new Manager("Alice", 101, 85000);
     Developer developer = new Developer("Bob", 102, 60000);
     Intern intern = new Intern("Charlie", 103, 30000);

     // Displaying details and calling the work method
     manager.displayDetails();
     manager.work();

     developer.displayDetails();
     developer.work();

     intern.displayDetails();
     intern.work();
 }
}

