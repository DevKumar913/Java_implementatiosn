package com.kumar.Strings;

public class Repeatingchars {
	
	public void repeatingChars(String str) {
		String printedChars="";
		for(int i=0;i<str.length();i++) {
			
			
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)&& printedChars.indexOf(str.charAt(i))==-1) {
					System.out.println(str.charAt(i));
					printedChars+=str.charAt(i);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Repeatingchars obj = new Repeatingchars();
		obj.repeatingChars("happy");

	}

}
