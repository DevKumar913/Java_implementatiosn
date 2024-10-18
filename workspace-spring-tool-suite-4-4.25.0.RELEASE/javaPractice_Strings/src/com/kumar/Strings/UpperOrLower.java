package com.kumar.Strings;

public class UpperOrLower {
	
	public void upperOrLower(String str, char flag) {
		String str1="";
		if(flag=='l') {
			str1=str.toLowerCase();
		}
		if(flag=='u') {
			str1=str.toUpperCase();
		}
		
		System.out.println(str1);
	}

	public static void main(String[] args) {
		UpperOrLower obj = new UpperOrLower();
		obj.upperOrLower("Hello", 'u');
		
		obj.upperOrLower("Hello", 'l');
		
		
	}

}
