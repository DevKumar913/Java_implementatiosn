package com.appolis.oops1;


//final keyword 
//final variable - constant
//final method - can't override
//final class - can't inherit

public class FinalKeyword {
	
	final double INTEREST;
	final static String BANKNAME;
	
//	{
//		INTEREST=0.05;
//	}
	
	static {
		
		BANKNAME="SBI";
	}
	 FinalKeyword()
		{
			this.INTEREST = 0;
			
//			System.out.println("error");
			
		}
  
	FinalKeyword(double interest)
	{
		this.INTEREST = interest;
		//System.out.println("Default constructor");
		
	}
	
	
	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword(0.05);;

	}

}
