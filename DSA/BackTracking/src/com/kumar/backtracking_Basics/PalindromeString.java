package com.kumar.backtracking_Basics;

public class PalindromeString {
	public boolean palindromeString(String str, int i, int n) {
		
		if(i>=n/2) return true;
		if(str.charAt(i)!=str.charAt(n-i-1)) return false;
		return palindromeString(str,i+1,n);
		
	}

	public static void main(String[] args) {
		PalindromeString obj = new PalindromeString();
		String str= "MDAM";
		int i=0;
		int n=str.length();
		boolean isPalindrome=obj.palindromeString(str,i,n);
		System.out.println("Given string "+str+" is a palindrome :"+isPalindrome);

	}

}
