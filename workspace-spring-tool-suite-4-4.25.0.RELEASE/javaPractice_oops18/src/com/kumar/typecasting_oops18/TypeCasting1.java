/**
 * Demonstration of Type Casting, Upcasting, Downcasting, 
 * Boxing, Autoboxing, and Unboxing in E-commerce
 */

package com.kumar.typecasting_oops18;

// Base class representing a generic product
class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }
}

// Subclass representing electronic products
class ElectronicProduct extends Product {
    int warrantyPeriod;

    public ElectronicProduct(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }

    void showElectronicProduct() {
        System.out.println("This is an electronic product.");
    }
}

public class TypeCasting1 {
    public static void main(String[] args) {
        // Upcasting: Treating a subclass object as its superclass
        Product generalProduct = new ElectronicProduct("Smartphone", 999.99, 2); // Upcasting

        // Call the method using upcasting
        generalProduct.displayProductDetails();

        // Downcasting: Casting a superclass reference back to a subclass
        if (generalProduct instanceof ElectronicProduct) {
            ElectronicProduct electronicProduct = (ElectronicProduct) generalProduct; // Downcasting
            electronicProduct.showElectronicProduct();
        }

        // Explicit type casting (int to double)
        int quantity = 10;
        double totalPrice = quantity * generalProduct.price; // Explicit casting of int to double
        System.out.println("Total Price for " + quantity + " items: $" + totalPrice);

        // Boxing: Converting a primitive type to its corresponding wrapper class
        int discountPercentage = 10;
        Integer boxedDiscount = Integer.valueOf(discountPercentage); // Boxing
        System.out.println("Boxed Discount Percentage: " + boxedDiscount);

        // Autoboxing: Automatic conversion of a primitive type to its corresponding wrapper class
        Integer autoBoxedDiscount = discountPercentage; // Autoboxing
        System.out.println("Autoboxed Discount Percentage: " + autoBoxedDiscount);

        // Unboxing: Converting an object of a wrapper class to its corresponding primitive type
        int unboxedDiscount = autoBoxedDiscount.intValue(); // Unboxing
        System.out.println("Unboxed Discount Percentage: " + unboxedDiscount);

        // Autounboxing: Automatic conversion of a wrapper class to its primitive type
        int autoUnboxedDiscount = autoBoxedDiscount; // Autounboxing
        System.out.println("Auto-unboxed Discount Percentage: " + autoUnboxedDiscount);
    }
}
