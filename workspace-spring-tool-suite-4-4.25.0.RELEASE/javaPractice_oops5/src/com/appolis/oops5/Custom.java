/*
 * This code is implementing  Local Variable 
 * 
 * 
 */
package com.appolis.oops5;

public class Custom {
	String contributor = "Mahesh";
	
	public void localVar() {
		String contributor = "Sanjeev";
		
		System.out.println("this name is from the getting from method : "+contributor);
		System.out.println("We are using this-keyword to get it from the instance variable : "+this.contributor);
	}

	public static void main(String[] args) {
		
		Custom con = new Custom();
		con.localVar();
		
		
		

	}

}
