/*
 * Implementing the customized default constructor and parameterized constructor
 * Here if there are no constructors defined the compiler will take the constructor which is default and sets the value to null or o
 * here if there is any constructor defined and there is no default constructor compiler will not allow us to use the default constructor
 */


package com.kumar.constructor.oops11;

class Product4{
	
	private String name;
	private double price;
	private String categoery;
	
	
	Product4(){
		System.out.println("This is the default parameter and here I am setting some values to the instance variables ");
		this.name="Generic product";
		this.price=0.0;
		this.categoery="general";
	}
	
	Product4(String name, double price, String categoery){
		System.out.println("Calling parameterized constructor to initialize instance parameters while craeting an object ");
		this.categoery=categoery;
		this.name=name;
		this.price=price;
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
	public String getCategoery() {
		return categoery;
	}
	public void setCategoery(String categoery) {
		this.categoery = categoery;
	}
	
	
}

public class Constrctor {

	public static void main(String[] args) {
		Product4 product= new Product4();
		System.out.println("Name:" + product.getName()+" pricein $: "+ product.getPrice()+" Categoery: "+ product.getCategoery());
		Product4 product2= new Product4("Mobile Phone", 899.99, "Electronics-Mobile" );
		System.out.println("Name:" + product2.getName()+" pricein $: "+ product2.getPrice()+" Categoery: "+ product2.getCategoery());
		
		
		

	}

}
