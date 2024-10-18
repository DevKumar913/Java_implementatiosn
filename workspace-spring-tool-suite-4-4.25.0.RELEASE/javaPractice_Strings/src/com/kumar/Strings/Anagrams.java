package com.kumar.Strings;

import java.util.Arrays;

public class Anagrams {
	
	public void anagrams(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			System.out.println(str1+" "+str2+"--> Given strings are not anagrams");
			return;
		}
		char[] str1ToChar= new char[str1.length()];
		char[] str2ToChar= new char[str2.length()];
		str1ToChar= str1.toCharArray();
		str2ToChar= str2.toCharArray();
		
		Arrays.sort(str1ToChar);
		Arrays.sort(str2ToChar);
		
		if(Arrays.equals(str1ToChar, str2ToChar)) {
			System.out.println(str1+" "+str2+"--> Given strings are anagrams");
		}
		else {
			System.out.println(str1+" "+str2+"--> Given strings are not anagrams");
		}
	}

	public static void main(String[] args) {
		Anagrams obj = new Anagrams();
		obj.anagrams("race", "care");

	}

}
