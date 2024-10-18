package com.kumar.inheritance.ass;

class Product2{
	String name;
	double price;
	String description;
	
	public void setProductDetails(String name,double price,String description) {
		this.name=name;
		this.description=description;
		this.price=price;
	
	}
}
	
class Electronic extends Product2{
	
	String batteryType;
	String GadgetType;
	int battryPower;
	
	public void setGadgetDetails(String batteryType, String GadgetType, int battryPower) {
		this.batteryType=batteryType;
		this.GadgetType=GadgetType;
		this.battryPower=battryPower;
	}
}
	
public class MobilePhoneMultilevel extends Electronic{
	
	int screenSize;
	String operatingSystem;
	
	public void setMobileDetails(String operatingSystem, int screenSize) {
		this.operatingSystem=operatingSystem;
		this.screenSize=screenSize;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+ name);
		System.out.println("description: "+ description);
		System.out.println("Price: "+ price);
		System.out.println("batteryType: "+ batteryType);
		System.out.println("GadgetType: "+ GadgetType);
		System.out.println("battryPower in hours: "+ battryPower);
		System.out.println("screenSize in inches : "+screenSize);
		System.out.println("operatingSystem: "+operatingSystem);
	}

	
	public static void main(String[] args) {
		
		MobilePhoneMultilevel mobile = new MobilePhoneMultilevel();
		
		mobile.setProductDetails("phone", 899, "mobile Phone");
		mobile.setGadgetDetails("li-ion", "Mobile", 16);
		mobile.setMobileDetails("IOS", 16);
		mobile.displayDetails();
		
		

	}

}
