package com.kumar.anynimous.finaloops14;


public class EmployeeAnanymous {
    private String ename;
    private float salary;
    private int age;

    // Default Constructor
    public EmployeeAnanymous() {
        System.out.println("Employee constructor invoked.");
    }

    // Parameterized Constructor
    public EmployeeAnanymous(String ename, float salary, int age) {
        this.ename = ename;
        this.salary = salary;
        this.age = age;
    }

    // Method to change employee details
    public void changeData(String ename, float salary, int age) {
        this.ename = ename;
        this.salary = salary;
        this.age = age;
    }

    // Method to print employee details
    public void printData() {
        System.out.println("Employee name: " + ename);
        System.out.println("Employee salary: " + salary);
        System.out.println("Employee age: " + age);
    }

    public static void main(String[] args) {
        // Creating an Employee using parameterized constructor
    	EmployeeAnanymous employee1 = new EmployeeAnanymous("Kim", 2000, 21);
        employee1.printData();  // Output the employee's data
        System.out.println();

        // Creating another Employee and printing their details directly
        new EmployeeAnanymous("John", 3000, 22).printData();
    }
}

