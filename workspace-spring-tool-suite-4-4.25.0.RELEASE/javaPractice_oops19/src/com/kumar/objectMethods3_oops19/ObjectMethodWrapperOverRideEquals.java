/**
 * Object Class : Demonstrating equals() method override in wrapper classes
 * using product names in an e-commerce domain
 *
 *
 */
package com.kumar.objectMethods3_oops19;


class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

public class ObjectMethodWrapperOverRideEquals {
    public static void main(String[] args) {
        // Creating two instances of Product with the same name
        Product product1 = new Product(new String("Smartphone"), 999.99);
        Product product2 = new Product(new String("Smartphone"), 1099.99);

        // Comparing product names using == operator (compares references)
        if (product1.getProductName() == product2.getProductName())
            System.out.println("Using '==': Product names are the same (true)");
        else
            System.out.println("Using '==': Product names are different (false)");

        // Comparing product names using equals() method (compares values)
        if (product1.getProductName().equals(product2.getProductName()))
            System.out.println("Using 'equals()': Product names are the same (true)");
        else
            System.out.println("Using 'equals()': Product names are different (false)");
    }
}