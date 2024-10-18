/*
 * 
 * Design classes for Customer, Product, Cart, and Order.
 *  Implement association where a Customer can add items to a Cart and place an Order.

 */
package com.kumar.Assignments_Task_2;

import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}

// Cart class
class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    // Method to add a product to the cart
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    // Method to calculate total price of all products in the cart
    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Method to display all products in the cart
    public void displayCart() {
        System.out.println("Cart Items:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Total Price: $" + getTotalPrice());
    }

    public List<Product> getProducts() {
        return products;
    }
}

// Order class
class Order {
    private Cart cart;
    private double totalAmount;

    public Order(Cart cart) {
        this.cart = cart;
        this.totalAmount = cart.getTotalPrice();
    }

    // Method to confirm and display the order details
    public void placeOrder() {
        System.out.println("Order placed with the following items:");
        cart.displayCart();
        System.out.println("Total Order Amount: $" + totalAmount);
    }
}

// Customer class
class Customer {
    private String name;
    private Cart cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new Cart();
    }

    // Method to add a product to the customer's cart
    public void addToCart(Product product) {
        cart.addProduct(product);
    }

    // Method to place an order
    public void placeOrder() {
        Order order = new Order(cart);
        order.placeOrder();
    }
}

// Main class to demonstrate the system
public class ECommerceSystem {

    public static void main(String[] args) {
        // Creating a customer
        Customer customer = new Customer("John");

        // Creating some products
        Product product1 = new Product("Laptop", 999.99, 1);
        Product product2 = new Product("Headphones", 199.99, 2);
        Product product3 = new Product("Mouse", 49.99, 3);

        // Customer adds products to the cart
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);

        // Customer places an order
        customer.placeOrder();
    }
}

