/**
 * Abstract Class in E-commerce Domain
 * Abstract class: Why constructor is allowed inside an abstract class
 */

package com.kumar.Abstract1_oops17;

// Abstract class representing a product
abstract class Product {
    String name;
    double price;

    // Constructor in abstract class to initialize common properties
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method for displaying product-specific details
    abstract void displayDetails();

    // Common method for all products
    void printBaseDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }
}

// Concrete class for Electronic Products
class ElectronicProduct extends Product {
    int warrantyPeriod; // Warranty period in years

    // Constructor for ElectronicProduct
    ElectronicProduct(String name, double price, int warrantyPeriod) {
        super(name, price); // Calling the constructor of the abstract class
        this.warrantyPeriod = warrantyPeriod;
    }

    // Implementing the abstract method
    @Override
    void displayDetails() {
        printBaseDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

public class AbstractClass2 {
    public static void main(String[] args) {
        // Create an instance of the electronic product
        ElectronicProduct laptop = new ElectronicProduct("Laptop", 1200.0, 2);

        // Display the product details
        laptop.displayDetails();
    }
}
