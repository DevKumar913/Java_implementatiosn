package com.kumar.objectMethods4_oops19;

class Product implements Cloneable{
	
	private int productId;
	private String productName;
	private double price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product( int productId, String productName, double price) {
		this.price=price;
		this.productId=productId;
		this.productName=productName;
	}
	
	public void displayDetails() {
		System.out.println("Product Id : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Product Price : $"+price);
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class ObjectMethodCloning {
    public static void main(String[] args)  {
    	
    	try {
	    	Product originalProduct = new Product(101, "Laptop", 1500.00);
	    	
	    	Product clonedProduct = (Product) originalProduct.clone();   
	    	
	    	System.out.println("Original Product Detials:");
	    	originalProduct.displayDetails();
	    	
	    	System.out.println("Cloned Product Detials:");
	    	clonedProduct.displayDetails();
    	}catch(CloneNotSupportedException c){
    		
    	}
    	
    }
}
