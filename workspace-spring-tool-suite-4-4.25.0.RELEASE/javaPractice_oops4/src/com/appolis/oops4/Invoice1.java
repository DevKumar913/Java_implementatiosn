/*
 * This code is implementing Instance Methods 
 * 
 * 
 */
package com.appolis.oops4;

public class Invoice1 {
	static double tax;
	String customerName;
	int customerId;
	double subTotal;
	double Total=(subTotal)+((subTotal*tax)/100);
	
	static void setTax(double tx) {
		tax=tx;
	}
	
	public void setDetais(String name,int id,double bill) {
		customerName=name;
		customerId=id;
		subTotal=bill;
	}
	
	void displayDetails() {
		System.out.println("Customer Details: "+customerId+" "+ customerName+" "+subTotal+" "+tax+" "+Total);
		
	}

	public static void main(String[] args) {
		
		
		Invoice1 customer1 = new Invoice1();
		Invoice1 customer2 = new Invoice1();
		Invoice1 customer3 = new Invoice1();
		
		setTax(9);
		System.out.println("tax using static method: " +tax);
		customer1.setDetais("john", 1, 100);
		customer2.setDetais("Brayan", 2, 200);
		customer3.setDetais("Seth", 3, 300);
		
		customer1.displayDetails();
		customer2.displayDetails();
		customer3.displayDetails();
	}

}
