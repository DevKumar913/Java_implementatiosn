/*
 * This code is implementinhg Static variable
 * 
 * 
 */

package oops1;

public class DicountPercent {
	static double discountPercent= 15.99;

	public static void main(String[] args) {
		//Accessing the static property directly as it is a static variable
		System.out.println(discountPercent);
		
		// Accessing the static variable using its class name
		System.out.println(DicountPercent.discountPercent);
		
		//Accessing the static variable using object reference
		DicountPercent discount = new DicountPercent();
		
		System.out.println(discount.discountPercent);
		

	}

}
