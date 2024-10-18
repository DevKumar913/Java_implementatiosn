/*
 * 
 * This implements Method overloading 
 * 
 */
package com.kumar.oops6;

public class PackageAmazon {
	
	private double totalCost;
	
	public void displayTotal(String Item1) {
		
		System.out.println("total cost of the One Item purchased is 300$");
		
	}
	public void displayTotal(String Item1,String item2) {
		System.out.println("total cost of the Two items purchased is 600$");
		
	}
	public void displayTotal(String Item1,String item2,String Item3) {
		System.out.println("total cost of the Three Items purchased is 900$");
	}
	
 
	
	

	public static void main(String[] args) {
		PackageAmazon obj1=new PackageAmazon();
		
		obj1.displayTotal("Laptop");
		obj1.displayTotal("Laptop","iphone");
		obj1.displayTotal("Laptop","iphone","Tablet");
		
		

	}

}
