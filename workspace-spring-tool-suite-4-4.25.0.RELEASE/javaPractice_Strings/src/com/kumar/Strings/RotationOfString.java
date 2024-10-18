package com.kumar.Strings;

public class RotationOfString {
	
	public boolean isRotation(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		String s= str1+str1;
		return s.contains(str2);
	}

	public static void main(String[] args) {
		RotationOfString obj = new RotationOfString();
		System.out.println(obj.isRotation("apple", "ppleap"));

	}

}
