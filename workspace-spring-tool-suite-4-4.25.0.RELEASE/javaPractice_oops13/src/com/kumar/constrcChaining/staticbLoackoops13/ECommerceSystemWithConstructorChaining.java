package com.kumar.constrcChaining.staticbLoackoops13;

class Product {
    String name;
    double price;
    String category;
    double finalPrice;  // Final price after tax
    static final double TAX_RATE = 0.1;  // 10% tax

    // Constructor 1: No parameters (Default product)
    public Product() {
        // Constructor chaining: calls the next constructor with default name
        this("Unnamed Product");
        System.out.println("Default product created with no parameters.");
    }

    // Constructor 2: Name only
    public Product(String name) {
        // Constructor chaining: calls the next constructor with default price
        this(name, 0.0);
        System.out.println("Product created with name only: " + name);
    }

    // Constructor 3: Name and price
    public Product(String name, double price) {
        // Constructor chaining: calls the next constructor with default category
        this(name, price, "Uncategorized");
        System.out.println("Product created with name and price: " + name + " at price $" + price);
    }

    // Constructor 4: Name, price, and category (fully initialized)
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.finalPrice = price + (price * TAX_RATE);
        System.out.println("Fully initialized product created: " + name + " in category " + category);
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
        System.out.println("Product Category: " + category);
        System.out.println("Final Price after Tax: $" + finalPrice);
    }
}

public class ECommerceSystemWithConstructorChaining {
    public static void main(String[] args) {
        // Product created using default constructor
        Product product1 = new Product();
        product1.displayProductDetails();
        System.out.println();

        // Product created with only name
        Product product2 = new Product("Laptop");
        product2.displayProductDetails();
        System.out.println();

        // Product created with name and price
        Product product3 = new Product("Smartphone", 799.99);
        product3.displayProductDetails();
        System.out.println();

        // Product created with name, price, and category
        Product product4 = new Product("Headphones", 129.99, "Electronics");
        product4.displayProductDetails();
    }
}
