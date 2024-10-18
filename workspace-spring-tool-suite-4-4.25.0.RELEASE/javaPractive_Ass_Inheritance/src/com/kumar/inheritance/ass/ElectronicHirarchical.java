package com.kumar.inheritance.ass;

class Product1{
	String name;
	double price;
	String description;
	
	public void setProductDetails(String name,double price,String description) {
		this.name=name;
		this.description=description;
		this.price=price;
	
	}
}

 class ClothingProduct extends Product1{
	
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
}

public class ElectronicHirarchical extends Product1{
	
	String batteryType;
	String GadgetType;
	int battryPower;
	
	public void setGadgetDetails(String batteryType, String GadgetType, int battryPower) {
		this.batteryType=batteryType;
		this.GadgetType=GadgetType;
		this.battryPower=battryPower;
	}
	public void displayGadgetDetails() {
		System.out.println("Name: "+ name);
		System.out.println("description: "+ description);
		System.out.println("Price: "+ price);
		System.out.println("batteryType: "+ batteryType);
		System.out.println("GadgetType: "+ GadgetType);
		System.out.println("battryPower in hours: "+ battryPower);
	}
	
	public static void main(String[] args) {
		
		ElectronicHirarchical gadget = new ElectronicHirarchical();
		
		gadget.setProductDetails("Iphone", 899, "black color");
		gadget.setGadgetDetails("LIthium Ion", "Mobile-Phone", 16);
		gadget.displayGadgetDetails();
		
	
		
		
		
	}

}
