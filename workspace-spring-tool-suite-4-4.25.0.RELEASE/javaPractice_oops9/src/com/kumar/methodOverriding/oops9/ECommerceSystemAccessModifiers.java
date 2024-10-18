/**
 * Implementation of method overriding by changing the access modifiers
 * 
 */
package com.kumar.methodOverriding.oops9;

class Customer2{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	private double total;	
	Customer2(String name, double total){
		this.name=name;
		this.total=total;
	}
	
	protected double calculateDiscount() {
		System.out.println("Base Customer Discount");
		return total * 0.05;
	}
}

class RegularCustomer2 extends Customer2{
	RegularCustomer2(String name, double total){
		super(name,total);
	}
}

class PremiumCustomer2 extends Customer2{
	PremiumCustomer2(String name, double total){
		super(name,total);
	}
	public double calculateDiscount() {
		System.out.println("Premium Customer Discount");
		return  getTotal()* 0.20;
	}
}

public class ECommerceSystemAccessModifiers {

	public static void main(String[] args) {
		RegularCustomer2 cust1 = new RegularCustomer2("John", 100);
		double dicount1=cust1.calculateDiscount();
		System.out.println("Customer name: " + cust1.getName() + "Total: "+ cust1.getTotal() + "Discount: "+dicount1 + " Total after Discount: "+ (cust1.getTotal()-dicount1));
		
		PremiumCustomer2 cust2 = new PremiumCustomer2("robert", 500);
		double dicount2=cust2.calculateDiscount();
		System.out.println("Customer name: " + cust2.getName() + "Total: "+ cust2.getTotal() + "Discount: "+ dicount2+ " Total after Discount: "+ (cust2.getTotal()-dicount1));
		
//		RegularCustomer cust1 = new RegularCustomer("John", 100);
//		System.out.println("Customer name: " + cust1.getName() + " Total: "+ cust1.getTotal() + " Discount: "+ cust1.calculateDiscount()+ " Total after Discount: "+ (cust1.getTotal()-cust1.calculateDiscount()));
//		
//		PremiumCustomer cust2 = new PremiumCustomer("Robert", 500);
//		System.out.println("Customer name: " + cust2.getName() + " Total: "+ cust2.getTotal() + " Discount: "+ cust2.calculateDiscount()+ " Total after Discount: "+ (cust2.getTotal()-cust2.calculateDiscount()));
//	

	}

}
