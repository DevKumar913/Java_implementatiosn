package com.kumar.Strings;

public class RemoveDuplicates {
	
	public String removeDuplictes(String str) {
		String uniqueString="";
		char[] strToChar = new char[str.length()];
		strToChar = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(uniqueString.indexOf(strToChar[i])==-1) {
				uniqueString+=strToChar[i];
			}
			
		}
		return uniqueString;
	}
	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		System.out.println(obj.removeDuplictes("aaaabcdeefdfgh"));
	}
}
