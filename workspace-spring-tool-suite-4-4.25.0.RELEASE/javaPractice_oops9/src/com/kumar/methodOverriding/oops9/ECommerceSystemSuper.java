
/**
 * Implementation of calling of super class method using super keyword.(method overriding) 
 * 
 */
package com.kumar.methodOverriding.oops9;

class Customer1{
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
	
	Customer1(String name, double total){
		this.name=name;
		this.total=total;
	}
	
	public double calculateDiscount() {
		System.out.println("Base Customer Discount");
		return total * 0.05;
	}
}

class RegularCustomer1 extends Customer1{
	RegularCustomer1(String name, double total){
		super(name,total);
	}
}

class PremiumCustomer1 extends Customer1{
	PremiumCustomer1(String name, double total){
		super(name,total);
	}
	public double calculateDiscount() {
		System.out.println("Premium Customer Discount");
		return  getTotal()* 0.20;
	}
	
	public double calculteDiscountForElectronic() {
		return super.calculateDiscount();
	}
	
}

public class ECommerceSystemSuper {

	public static void main(String[] args) {
		RegularCustomer1 cust1 = new RegularCustomer1("John", 100);
		double dicount1=cust1.calculateDiscount();
		System.out.println("Customer name: " + cust1.getName() + "Total: "+ cust1.getTotal() + "Discount: "+dicount1 + " Total after Discount: "+ (cust1.getTotal()-dicount1));
		
		PremiumCustomer1 cust2 = new PremiumCustomer1("robert", 500);
		double dicount2=cust2.calculteDiscountForElectronic();
		System.out.println("Customer name: " + cust2.getName() + "Total: "+ cust2.getTotal() + "Discount: "+ dicount2+ " Total after Discount: "+ (cust2.getTotal()-dicount1));

	}

}