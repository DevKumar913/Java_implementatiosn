package com.kumar.inheritance.ass;


class Product{
	String name;
	double price;
	String description;
	
	public void setProductDetails(String name,double price,String description) {
		this.name=name;
		this.description=description;
		this.price=price;
	
	}
}

public class ClothingProductSingleInheritance extends Product{
	
	String size;
	String color;
	
	public void setClothDetails(String size,String color) {
		this.size=size;
		this.color=color;
	}
	
	public void displayClothDetails() {
		System.out.println("Name: "+ name);
		System.out.println("description: "+ description);
		System.out.println("Price: "+ price);
		System.out.println("size: "+ size);
		System.out.println("color: "+ color);
	}
	
	public static void main(String[] args) {
		
		ClothingProductSingleInheritance cloth = new ClothingProductSingleInheritance();
		cloth.setProductDetails("T-shirt", 29.99, "half-sleeve");
		cloth.setClothDetails("M", "yellow");
		cloth.displayClothDetails();
		

	}

}
