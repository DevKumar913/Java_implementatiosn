package com.kumar.Strings;

public class FrequencyOfSpecificChar {
	
	public void frequencyOfSpecificChar(String str, char ch) {
		char[] strToCharArray=new char[str.length()];
		strToCharArray = str.toCharArray();
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(ch==strToCharArray[i]) {
				count++;
			}
		}
		System.out.println(ch+" is repeated  "+count+"  times");
	}
	

	public static void main(String[] args) {
		FrequencyOfSpecificChar obj = new FrequencyOfSpecificChar();
		obj.frequencyOfSpecificChar("aabhaguhj", 'z');

	}

}
