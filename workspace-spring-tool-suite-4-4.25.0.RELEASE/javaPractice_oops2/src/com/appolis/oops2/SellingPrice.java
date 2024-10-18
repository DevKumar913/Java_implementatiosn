/*
 * Implementing both static and instance variables
 * 
 * 
 */

package com.appolis.oops2;

public class SellingPrice {
	static double discountprice;
	double price;

	public static void main(String[] args) {
		SellingPrice.discountprice=9.99;
		System.out.println("Discount price is :"+ SellingPrice.discountprice );
		
		SellingPrice phone = new SellingPrice();
		SellingPrice laptop = new SellingPrice();
		
		phone.discountprice=199.99;
		System.out.println("Discount price is :"+ phone.discountprice );
		
		
		phone.price=899;
		laptop.price=1299;
		
		System.out.println("price of phone after new discount update is : "+(phone.price - phone.discountprice));
		System.out.println("price of phone after new discount update is : "+(laptop.price - laptop.discountprice));
	}

}
