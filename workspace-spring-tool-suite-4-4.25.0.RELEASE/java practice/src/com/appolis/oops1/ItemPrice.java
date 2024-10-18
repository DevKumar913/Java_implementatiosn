/*
 * This code is implementing Instance variable
 * 
 * 
 */
package com.appolis.oops1;

public class ItemPrice {
	int price;
	
	

	public static void main(String[] args) {
		
		//Accessing instance variable using object reference
		ItemPrice pen = new ItemPrice();
		ItemPrice waterBottle = new ItemPrice();
		ItemPrice phone = new ItemPrice();
		pen.price=10;
		waterBottle.price=20;
		phone.price=800;
		System.out.println("price of pen is: " + pen.price);
		System.out.println("price of water bottle is : "  + waterBottle.price);
		System.out.println("price of phone is : "+ phone.price);
		

	}

}
