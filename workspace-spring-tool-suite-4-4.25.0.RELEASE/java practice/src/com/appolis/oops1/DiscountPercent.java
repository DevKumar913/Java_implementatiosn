package com.appolis.oops1;

/*
 * This code is implementing Static variable
 * 
 * 
 */
public class DiscountPercent {
	static double discountPercent= 15.99;

	public static void main(String[] args) {
		//Accessing the static property directly as it is a static variable
		System.out.println("accesing static directly"+discountPercent);
		
		// Accessing the static variable using its class name
		System.out.println("Accessing the static variable using its class name"+DiscountPercent.discountPercent);
		
		//Accessing the static variable using object reference
		DiscountPercent discount = new DiscountPercent();
		
		System.out.println("Accessing the static variable using object reference"+discount.discountPercent);
	}
}