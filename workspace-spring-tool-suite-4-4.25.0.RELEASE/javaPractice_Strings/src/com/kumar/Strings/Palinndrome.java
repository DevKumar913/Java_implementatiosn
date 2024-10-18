package com.kumar.Strings;
public class Palinndrome {
	
	public void palindrome(String str) {
		char[] strToChar= new char[str.length()];
		strToChar = str.toCharArray();
		System.out.println("Given String literal is :"+ str);
		String revString="";
		for(int i=str.length()-1;i>=0;i--) {
			revString+=strToChar[i];
		}
		if(str.equals(revString)) {
			System.out.println("Entered string is palindrome.");
		}
		else {
			System.out.println("Entered string is not a palindrome.");
		}
	}
	public static void main(String[] args) {
		Palinndrome obj = new Palinndrome();
		obj.palindrome("mom");	
		}
}
