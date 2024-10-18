/*
 * Task 3: Implement a Java class to manage a shopping cart, 
 * with an instance data member to store the items in the cart 
 * and instance methods to add, remove, and calculate 
 * the total price of the items.
 */

package com.kumar.Assignments_oops1;

public class ShoppingCart {
	private int itemsInCart;
	
	public int getItemsInCart() {
		return itemsInCart;
	}

	public void setItemsInCart(int itemsInCart) {
		this.itemsInCart = itemsInCart;
	}
	
	public int addItem() {	
		return itemsInCart++;
	}
	public int removeItem() {
		if(itemsInCart>0) {
			return itemsInCart--;
		}
		else {
			return 0;
		}
	}
	
	public double calculatePrice(int itemsInCart, int priceOfEachItem) {
		return priceOfEachItem*itemsInCart;
	}
	
	public static void main(String[] args) {
	}

}
