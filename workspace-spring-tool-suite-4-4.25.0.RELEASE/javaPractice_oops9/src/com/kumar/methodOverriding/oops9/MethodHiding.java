package com.kumar.methodOverriding.oops9;


class Product1{
	
	public static void displayProductType() {
		System.out.println("Generic Product");
	}
	
}

class Electronics extends Product1{
	
	public static void displayProductType() {
		System.out.println("Electronic Product");
	}
}

class Clothing extends Product1{
	public static void displayProductType() {
		System.out.println("Clothing Product");
	}
}

public class MethodHiding {

	public static void main(String[] args) {
		
		Product1.displayProductType();
		Electronics.displayProductType();
		Clothing.displayProductType();
		
		Product1 p1 =new Electronics();
		Product1 p2 =new Clothing();
		
		
		/*
		 * Since static methods are bound at compile time, 
		 * these will use the methods from the Product class
		 * 
		 * 
		 *Static methods belong to the class rather than the instance 
		 *of the class. When you invoke a static method, 
		 *it's associated with the class where the method is declared,
		 * and not with the specific object instance. 
		 * This is why the method call is resolved at compile time 
		 * based on the reference type, not the runtime type of the object.
		*/
		
		p1.displayProductType();
		p2.displayProductType();
	}

}
