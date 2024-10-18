package com.kumar.Strings;

public class RevString {
	
	public String revString(String str) {
		char[] s2Char= new char[str.length()];
		s2Char=str.toCharArray();
		String revString="";
		for(int i=str.length()-1;i>=0;i--) {
			revString+=s2Char[i];
			
		}
		return revString;
	}

	public static void main(String[] args) {
		RevString obj = new RevString();
		System.out.println(obj.revString("hello"));

	}

}
