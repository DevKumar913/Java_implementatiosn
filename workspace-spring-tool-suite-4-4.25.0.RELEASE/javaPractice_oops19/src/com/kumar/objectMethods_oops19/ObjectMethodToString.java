

package com.kumar.objectMethods_oops19;

class Product {
    private String productName;
    private double price;
    private String category;

    public Product(String productName, double price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    // Overriding toString() method
    public String toString() {
        return "Product{ Name: '" + productName + "', Price: $" + price + ", Category: '" + category + "' }";
    }
}

public class ObjectMethodToString {
    public static void main(String[] args) {
        // Creating instances of Product class
        Product product1 = new Product("Laptop", 1200.00, "Electronics");
        Product product2 = new Product("Sneakers", 75.50, "Footwear");

        // Printing the product details, which will implicitly call the toString() method
        System.out.println(product1);
        System.out.println(product2);
    }
}