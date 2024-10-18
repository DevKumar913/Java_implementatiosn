/*
 * This implements method overloading by swaping the data types
 * 
 */
package com.kumar.oops6;

public class OverLoading3 {

	public double sum(int a, double b) {
		System.out.println("integer and double Parameters");
		return a+b;
		
	}
	
	public double sum(double a, int b) {
		System.out.println("double and integer Parameters");
			return a+b;
	}
	


	public static void main(String[] args) {
		OverLoading3 obj1 = new OverLoading3();
		System.out.println(obj1.sum(1,2.2 ));
		System.out.println(obj1.sum(1.1,2));
		

}

}
