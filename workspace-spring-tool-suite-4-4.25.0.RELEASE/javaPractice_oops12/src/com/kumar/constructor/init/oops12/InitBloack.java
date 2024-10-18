package com.kumar.constructor.init.oops12;

class Product6{
	private String name;
	private double price;
	private String cateogoery;
	private double finalPrice;
	static final double TAX_DEDUCTION=0.1;
	
	{
		finalPrice=price+(price*TAX_DEDUCTION);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCateogoery() {
		return cateogoery;
	}

	public void setCateogoery(String cateogoery) {
		this.cateogoery = cateogoery;
	}

	
	
	Product6(){
		System.out.println("This is using no parameters and initialization using constructor ");
		this.cateogoery="Generic cateogoery";
		this.name="Generic Name";
		this.price=0.0;
	}
	
	Product6(String name){
		System.out.println("This is using one  parameter and initialization using constructor ");
		this.cateogoery="Generic cateogoery";
		this.name=name;
		this.price=0.0;
	}
	
	Product6(String name,double price){
		System.out.println("This is using 2 parameters and initialization using constructor ");
		this.cateogoery="Generic cateogoery";
		this.name=name;
		this.price=price;
	}
	
	Product6(String name,double price,String cateogoery){
		System.out.println("This is using all the 3 parameters initialization using constructor ");
		this.cateogoery=cateogoery;
		this.name=name;
		this.price=price;
	}
	
	public void printDetails() {
		System.out.println("Name: "+name +" Price: "+price+" cateogoery: "+cateogoery+" Final Price: "+ finalPrice);
	}
}

public class InitBloack {

	public static void main(String[] args) {
		Product6 pro = new Product6();
		pro.printDetails();
		Product6 pro1 = new Product6("Iphone");
		pro1.printDetails();
		Product6 pro2 = new Product6("Iphone", 899.99);
		pro2.printDetails();
		Product6 pro3 = new Product6("Iphone", 899.99,"MobilePhone");
		pro3.printDetails();
	}

}
