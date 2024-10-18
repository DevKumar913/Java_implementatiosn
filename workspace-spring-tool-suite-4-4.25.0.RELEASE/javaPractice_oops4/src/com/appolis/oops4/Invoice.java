/*
 * This code is implementing Instance Method 
 * 
 * 
 */
package com.appolis.oops4;

public class Invoice {
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

	public static void main(String[] args) {
		
		
		Invoice customer1 = new Invoice();
		Invoice customer2 = new Invoice();
		Invoice customer3 = new Invoice();
		
		setTax(9);
		System.out.println("tax using static method: " +tax);
		customer1.setDetais("john", 1, 100);
		customer2.setDetais("Brayan", 2, 200);
		customer3.setDetais("Seth", 3, 300);
		
		System.out.println("Customer1 Details: "+customer1.customerId+" "+ customer1.customerName+" "+customer1.subTotal+" "+tax+" "+customer1.Total);
		System.out.println("Customer2 Details: "+customer2.customerId+" "+ customer2.customerName+" "+customer2.subTotal+" "+tax+" "+customer2.Total);
		System.out.println("Customer3 Details: "+customer3.customerId+" "+ customer3.customerName+" "+customer3.subTotal+" "+tax+" "+customer3.Total);

	}

}
