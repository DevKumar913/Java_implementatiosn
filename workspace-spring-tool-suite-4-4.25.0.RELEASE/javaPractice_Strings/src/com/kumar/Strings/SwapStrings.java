package com.kumar.Strings;

public class SwapStrings {
	public void swapStrings(String str1, String str2) {
		System.out.println(str1);
		System.out.println(str2);
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println();
		System.out.println(str1);
		System.out.println(str2);
	}

	public static void main(String[] args) {
		SwapStrings ob = new SwapStrings();
		ob.swapStrings("hello", "world");

	}

}
