/*
 * Implementation of Method Overloading by changing number of parameters
 * 
 */
package com.kumar.oops6;

public class OverLoading1 {
	
	public int sum(int a, int b) {
		System.out.println("Two Parameters");
		return a+b;
		
	}
	
	public int sum(int a, int b,int c) {
		System.out.println("Three Parameters");
			return a+b+c;
	}
	
	public int sum(int a, int b,int c, int d) {
		System.out.println("Four Parameters");
		return a+b+c+d;
	}

	public static void main(String[] args) {
		OverLoading1 obj1 = new OverLoading1();
		System.out.println(obj1.sum(1,2 ));
		System.out.println(obj1.sum(1, 2,3));
		System.out.println(obj1.sum(1,2,3,4));
		
		
		
		

	}

}
