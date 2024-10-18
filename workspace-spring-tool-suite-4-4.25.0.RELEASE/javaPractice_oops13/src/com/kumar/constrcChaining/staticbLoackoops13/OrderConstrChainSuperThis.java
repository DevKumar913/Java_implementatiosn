package com.kumar.constrcChaining.staticbLoackoops13;

//Company class to represent the company associated with the employee
class Company {
 String cname;

 // Constructor with company name
 Company(String cname) {
     this.cname = cname;
 }

 // Default constructor
 public Company() {
     super(); // Calls the Object class constructor
 }
}

//Order class to represent employee details along with order management
public class OrderConstrChainSuperThis extends Company {
 private String productName;
 private double price;
 private int quantity;

 // Constructor 1: Complete order details
 public OrderConstrChainSuperThis(String productName, double price, int quantity) {
     this.productName = productName;
     this.price = price;
     this.quantity = quantity;
 }

 // Constructor 2: Product name and quantity, with a default price
 public OrderConstrChainSuperThis(String productName, int quantity) {
     this(100.0); // Calls Constructor 3 (price only)
     this.productName = productName;
     this.quantity = quantity;
 }

 // Constructor 3: Default company and price only
 public OrderConstrChainSuperThis(double price) {
     super("Amazon"); // Calls Company constructor with "Amazon" as the company name
     this.price = price;
 }

 // Method to display order details
 public void displayOrderDetails() {
     System.out.println("Product Name: " + productName);
     System.out.println("Price per item: $" + price);
     System.out.println("Quantity ordered: " + quantity);
     System.out.println("Order from company: " + cname);
 }

 // Main method to create order and print details
 public static void main(String[] args) {
     // Order created using product name and quantity, default price of $100
	 OrderConstrChainSuperThis order = new OrderConstrChainSuperThis("Laptop", 2);
     order.displayOrderDetails();
 }
}
