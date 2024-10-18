package com.kumar.constructor.init.oops12;


class Product5{
	private String name;
	private double price;
	private String cateogoery;
	
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

	
	
	Product5(){
		System.out.println("This is using no parameters and initialization using constructor ");
		this.cateogoery="Generic cateogoery";
		this.name="Generic Name";
		this.price=0.0;
	}
	
	Product5(String name){
		System.out.println("This is using one  parameter and initialization using constructor ");
		this.cateogoery="Generic cateogoery";
		this.name=name;
		this.price=0.0;
	}
	
	Product5(String name,double price){
		System.out.println("This is using 2 parameters and initialization using constructor ");
		this.cateogoery="Generic cateogoery";
		this.name=name;
		this.price=price;
	}
	
	Product5(String name,double price,String cateogoery){
		System.out.println("This is using all the 3 parameters initialization using constructor ");
		this.cateogoery=cateogoery;
		this.name=name;
		this.price=price;
	}
	
	public void printDetails() {
		System.out.println("Name: "+name +" Price: "+price+" cateogoery: "+cateogoery);
	}
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
		Product5 pro = new Product5();
		pro.printDetails();
		Product5 pro1 = new Product5("Iphone");
		pro1.printDetails();
		Product5 pro2 = new Product5("Iphone", 899.99);
		pro2.printDetails();
		Product5 pro3 = new Product5("Iphone", 899.99,"MobilePhone");
		pro3.printDetails();
	}

}
