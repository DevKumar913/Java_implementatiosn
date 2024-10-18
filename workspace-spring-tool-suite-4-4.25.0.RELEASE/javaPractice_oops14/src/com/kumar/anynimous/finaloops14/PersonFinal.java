package com.kumar.anynimous.finaloops14;



public class PersonFinal {
    // Final instance variable (Person's name)
    final String NAME;
    
    // Final static variable (Company name)
    final static String CNAME;

    // Static block to initialize the static variable (company name)
    static {
        CNAME = "HCL"; // In real time, this could be the e-commerce company name
        System.out.println("Static block executed: Company name initialized.");
    }

    // Constructor to initialize the final instance variable (Person's name)
    public PersonFinal(String name) {
        this.NAME = name;
    }

    // Method to display person's details
    public void displayData() {
        System.out.println("Person Name: " + NAME);
        System.out.println("Company Name: " + CNAME);
    }

    public static void main(String[] args) {
        // Creating a Person object representing an employee or customer
    	PersonFinal person1 = new PersonFinal("John");
        person1.displayData();  // Display person's details
        
        System.out.println();
        
        // Creating another Person object
        PersonFinal person2 = new PersonFinal("Emily");
        person2.displayData();  // Display another person's details
    }
}

