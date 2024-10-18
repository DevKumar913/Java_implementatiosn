/**
 * Interface
 * Dynamic Binding
 * media player can handle different types of media sources without being tied 
 * to a specific implementation, for that reason use Java interfaces.
 */ 
 
 
package com.kumar.interface_ops16;


//Payment interface for different payment methods

interface Payment{
	void processPayment(double amount );
}

//Shipping interface for different shipping methods

interface Shipping{
	void processShipping(String productName);
}

//Credit card payment implementation

class CreditCardPayment implements Payment {
	public void processPayment(double amount) {
		System.out.println("Process the credit card payment of $ : "+ amount);
	}
}

//PayPal payment implementation

class PaypalPayment implements Payment{
	public void processPayment(double amount) {
		System.out.println("Process the Paypal  payment of $ : "+ amount);
	}
}

//Air shipping implementation

class AirShipping implements Shipping{
	public void processShipping(String productName) {
		System.out.println("Process the Air Shipping of the product :   "+ productName);
	}
}

//Ground shipping implementation
class GroundShipping implements Shipping{
	public void processShipping(String productName) {
		System.out.println("Process the Ground Shipping of the product :   "+ productName);
	}
}

//E-commerce system class handling checkout and shipping processes

class ECommerceSystem{
	private Payment paymentMethod;
	private Shipping shippingMethod;
	
	ECommerceSystem(Payment paymentMethod,Shipping shippingMethod){
		this.paymentMethod=paymentMethod;
		this.shippingMethod=shippingMethod;
	}
	//Method to process payment
	public void checkOut(double amount) {
		paymentMethod.processPayment(amount);
	}
	
	//Method to handle shipping
	public void ship(String productName) {
		shippingMethod.processShipping(productName);
	}	
}
//Checkout with a payment and ship the product


//Main class to simulate an e-commerce transaction
public class Interface1Impl {

	public static void main(String[] args) {
		//Customer selects PayPal as the payment method and Air Shipping for shipping
		
		Payment p = new PaypalPayment();
		Shipping s=new AirShipping();
		
		//Checkout with a payment and ship the product
		ECommerceSystem eCommerceSystem= new ECommerceSystem(p,s);
		eCommerceSystem.checkOut(899.99);
		eCommerceSystem.ship("laptop");
		
		System.out.println();
		
		//Customer selects Credit Card as the payment method and Ground Shipping
		
		Payment p1 = new CreditCardPayment();
		Shipping s1=new GroundShipping();
		
		ECommerceSystem eCommerceSystem1= new ECommerceSystem(p1,s1);
		eCommerceSystem1.checkOut(899.99);
		eCommerceSystem1.ship("laptop");
		
		

	}

}
