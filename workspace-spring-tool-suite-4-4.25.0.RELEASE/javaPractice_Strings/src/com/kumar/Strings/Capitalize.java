package com.kumar.Strings;

public class Capitalize {
	
	public void capitalize(String str) {
		char[] strToCharArray = new char[str.length()];
		strToCharArray= str.toCharArray();
		String capitalize=""+Character.toUpperCase(strToCharArray[0]);
		for(int i=1;i<str.length();i++) {
			if(strToCharArray[i-1]!=' ') {
				capitalize+=strToCharArray[i];
			}
			else {
				capitalize+=(Character.toUpperCase(strToCharArray[i]) );
			}
		}
		
		System.out.println(capitalize);
	}

	public static void main(String[] args) {
		Capitalize obj = new Capitalize();
		obj.capitalize(" I want to Capi talize");
		
		
	}

}
