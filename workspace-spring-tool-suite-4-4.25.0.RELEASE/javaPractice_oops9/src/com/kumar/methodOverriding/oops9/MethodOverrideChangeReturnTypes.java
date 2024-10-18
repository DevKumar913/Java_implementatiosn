package com.kumar.methodOverriding.oops9;

class Product{
	private String name;
	private double price;
	
	Product(String name, double price){
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
	
	public Product getProductDetails() {
		System.out.println("Returning Product details");
		return this;
	}
}

class ElectronicProduct extends Product{
	private int warrantyInMonths;

	public int getWarrantyInMonths() {
		return warrantyInMonths;
	}

	public void setWarrantyInMonths(int warrantyInMonths) {
		this.warrantyInMonths = warrantyInMonths;
	}
	
	ElectronicProduct(String name, double price, int warrantyInMonths){
		super(name,price);
		this.warrantyInMonths=warrantyInMonths;
	}
	
	public ElectronicProduct getProductDetails(){
		System.out.println("returning electronics product details with warranty");
		return this;
	}
}

public class MethodOverrideChangeReturnTypes {

	public static void main(String[] args) {
		
		Product generalProduct = new Product("Pencil_box",20);
		generalProduct.getProductDetails();
		
		Product generalProduct1 = new ElectronicProduct("Pencil_box",20,2);
		generalProduct1.getProductDetails();
		
		ElectronicProduct electronicProduct = new ElectronicProduct("Pencil_box",20,2);
		electronicProduct.getProductDetails();
	}
}
