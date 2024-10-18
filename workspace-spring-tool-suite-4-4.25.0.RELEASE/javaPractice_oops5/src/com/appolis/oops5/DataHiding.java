/*
 * This code is implementing  Data Hiding 
 * 
 * 
 */
package com.appolis.oops5;

class EarPhones{
	
	String function ="plays Audio-super class";
	
}
class Airpods extends EarPhones{
	
	String function="Plays audio also acts as hearing aid-- Sub class";
	
	void functionality() {
		String function ="Plays audio also acts as hearing aid and noise cancellation-- local to method";
		System.out.println("this is printing from local that is method"+ function);
		System.out.println("this is printing from class "+ this.function);
		System.out.println("this is printing from super-class "+ super.function);
		
	}
	
	
}


public class DataHiding {
	 public static void main(String args[]) {
		 
		 Airpods podsPro = new Airpods();
		 podsPro.functionality();
	 }


}
