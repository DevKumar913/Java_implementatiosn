package com.kumar.interface2.oops16;

//Define the Payment interface
interface Payment {
	void processPayment();
	void cancelPayment();
}

//Define the Shipping interface
interface Shipping {
	void shipProduct();
	void trackOrder();
}

//OrderProcessor implements both Payment and Shipping interfaces
class OrderProcessor implements Payment, Shipping {
	private String paymentMethod;
	private String shippingMethod;

	// Constructor to initialize payment and shipping methods
	public OrderProcessor(String paymentMethod, String shippingMethod) {
		this.paymentMethod = paymentMethod;
		this.shippingMethod = shippingMethod;
	}

	// Implement Payment methods
	@Override
	public void processPayment() {
		System.out.println("Processing payment using: " + paymentMethod);
	}

	@Override
	public void cancelPayment() {
		System.out.println("Canceling payment for: " + paymentMethod);
	}

	// Implement Shipping methods
	@Override
	public void shipProduct() {
		System.out.println("Shipping product via: " + shippingMethod);
	}

	@Override
	public void trackOrder() {
		System.out.println("Tracking order via: " + shippingMethod);
	}
}

//Main class demonstrating multiple interface implementation
public class InterfaceImpl2 {
	public static void main(String[] args) {
		// Create an OrderProcessor instance with Credit Card payment and Standard Shipping
		OrderProcessor order1 = new OrderProcessor("Credit Card", "Standard Shipping");
		System.out.println("Order 1:");
		order1.processPayment();
		order1.shipProduct();
		order1.trackOrder();
		order1.cancelPayment();
		System.out.println();

		// Create an OrderProcessor instance with PayPal payment and Express Shipping
		OrderProcessor order2 = new OrderProcessor("PayPal", "Express Shipping");
		System.out.println("Order 2:");
		order2.processPayment();
		order2.shipProduct();
		order2.trackOrder();
		order2.cancelPayment();
	}
}
