package com.kumar.Strings;

public class FirstNonRepeatedChar {
	
	public char firstNonRepeatedChar(String str) {
		
		for(int i=0;i<str.length();i++) {
			boolean isRepeated = false;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					isRepeated=true;
					break;
				}
			}
			if(!isRepeated) {
				return str.charAt(i);
			}
		}
		return '-';
	}

	public static void main(String[] args) {
		FirstNonRepeatedChar ob = new FirstNonRepeatedChar();
		System.out.println(ob.firstNonRepeatedChar("happyxhayzz"));
	}
}
