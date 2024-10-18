/*
 * This code is implementing Static Method
 * 
 * 
 */
package com.appolis.oops3;

public class InvoiceGenerate {
	
	static double taxPercent;
	double totalCost;
	String customerName;
	double invoicePrice;
	
	static void changeTaxPercent(double d) {
		taxPercent=d;
	}

	public static void main(String[] args) {
		InvoiceGenerate.taxPercent=9;
		System.out.println("Accessed using class name: " + InvoiceGenerate.taxPercent);
		System.out.println("Accessed directly : "+ taxPercent);
		
		InvoiceGenerate book = new InvoiceGenerate();
		book.taxPercent=3.5;
		book.totalCost=300;
		book.customerName="Joseph";
		book.invoicePrice=((book.totalCost)+((book.totalCost*taxPercent)/100));
		
		
		
		System.out.println("cutomer who bought education related stuff");
		System.out.println("Customer Name: " + book.customerName);
		System.out.println("Total Cost: "+ book.totalCost);
		System.out.println("Tax: "+ taxPercent);
		
		System.out.println("Total payable is : "+ book.invoicePrice);
		
		
		
		
		
		
		

	}

}
