package com.kumar.Strings;

public class RemoveWhiteSpaces {
	
	public void removeWhiteSpaces(String str) {
		
		char[] strToChar = new char[str.length()];
		strToChar= str.toCharArray();
		String noSpace="";
		for(int i=0;i<str.length();i++) {
			if(strToChar[i]!=' ' && strToChar[i]!='\t') {
				noSpace+=strToChar[i];
			}
		}
		System.out.println(noSpace);
	}
	public static void main(String[] args) {
		RemoveWhiteSpaces obj = new RemoveWhiteSpaces();
		obj.removeWhiteSpaces("Hello World			tab");
	}

}
