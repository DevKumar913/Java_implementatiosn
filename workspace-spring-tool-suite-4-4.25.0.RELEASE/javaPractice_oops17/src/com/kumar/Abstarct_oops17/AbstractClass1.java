package com.kumar.Abstarct_oops17;

//Abstract class representing a product
abstract class Product {
 private String name;
 private double price;

 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }

 // Abstract method to calculate discount
 abstract double calculateDiscount();

 public void displayDetails() {
     System.out.println("Product Name: " + name);
     System.out.println("Price: $" + price);
     System.out.println("Discounted Price: $" + (price - calculateDiscount()));
 }
}

//Concrete class for Electronics
class Electronics extends Product {
 private double discountRate; // Discount rate specific to electronics

 public Electronics(String name, double price, double discountRate) {
     super(name, price);
     this.discountRate = discountRate;
 }

 @Override
 double calculateDiscount() {
     return getPrice() * discountRate;
 }
}

//Concrete class for Furniture
class Furniture extends Product {
 private static final double FLAT_DISCOUNT = 50.0; // Flat discount for furniture

 public Furniture(String name, double price) {
     super(name, price);
 }

 @Override
 double calculateDiscount() {
     return FLAT_DISCOUNT;
 }
}

//Main class to test the functionality
public class AbstractClass1 {
 public static void main(String[] args) {
     // Create instances of products
     Product laptop = new Electronics("Laptop", 1000.0, 0.10); // 10% discount
     Product sofa = new Furniture("Sofa", 600.0); // Flat $50 discount

     // Display product details
     laptop.displayDetails();
     System.out.println();
     sofa.displayDetails();
 }
}