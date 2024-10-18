package com.kumar.objectMethods2_oops19;


class Product {
    private String productName;
    private int productCode;
    private double price;

    public Product(String productName, int productCode, double price) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    // Overriding equals() method to compare products based on productCode
    public boolean equals(Product obj) {
        if (this.productCode != obj.productCode) {
            return false;
        }
        return true;
    }

    // Getters for printing product details
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

public class ObjectMethodEquals {
    public static void main(String[] args) {
        // Creating instances of Product class
        Product product1 = new Product("Smartphone", 101, 999.99);
        Product product2 = new Product("Laptop", 102, 1299.99);
        Product product3 = new Product("Smartphone", 101, 999.99);

        // Comparing products based on productCode using equals() method
        if (product1.equals(product3))
            System.out.println("Product 1 and Product 3 are the same.");
        else
            System.out.println("Product 1 and Product 3 are different.");

        if (product1.equals(product2))
            System.out.println("Product 1 and Product 2 are the same.");
        else
            System.out.println("Product 1 and Product 2 are different.");
    }
}
