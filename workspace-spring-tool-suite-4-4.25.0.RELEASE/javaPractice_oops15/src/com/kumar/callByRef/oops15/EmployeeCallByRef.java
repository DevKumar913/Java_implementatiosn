package com.kumar.callByRef.oops15;

public class EmployeeCallByRef {
    private String ename;
    private String age;
    private int salary;

    // Method to set employee data (Call by Value)
    public void setEmployeeData(String ename, String age, int salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    // Method to set employee data (Call by Reference)
    public void setEmployeeData(EmployeeCallByRef employee) {
        this.ename = employee.ename;
        this.age = employee.age;
        this.salary = employee.salary;
    }

    // Override toString method to display employee details
    @Override
    public String toString() {
        return "Employee [Name=" + ename + ", Age=" + age + ", Salary=" + salary + "]";
    }

    public static void main(String[] args) {
        // Example of setting data using call by value
    	EmployeeCallByRef employee1 = new EmployeeCallByRef();
        employee1.setEmployeeData("Tom", "25", 2555);   // Call by value
        System.out.println("Employee 1: " + employee1);

        // Example of setting data using call by reference
        EmployeeCallByRef employee2 = new EmployeeCallByRef();
        employee2.setEmployeeData(employee1);  // Call by reference, copying from employee1
        System.out.println("Employee 2 (copied from Employee 1): " + employee2);
    }
}

