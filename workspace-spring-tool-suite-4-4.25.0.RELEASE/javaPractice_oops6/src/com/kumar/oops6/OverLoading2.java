/*
 * Implementation of Method Overloading by changing Data Type of parameters
 * 
 */
package com.kumar.oops6;

public class OverLoading2 {

	public int sum(int a, int b) {
		System.out.println("integer Parameters");
		return a+b;
		
	}
	
	public double sum(double a, double b) {
		System.out.println("double Parameters");
			return a+b;
	}
	


	public static void main(String[] args) {
		OverLoading2 obj1 = new OverLoading2();
		System.out.println(obj1.sum(1,2 ));
		System.out.println(obj1.sum(1.1,2.2));
		

}
}
