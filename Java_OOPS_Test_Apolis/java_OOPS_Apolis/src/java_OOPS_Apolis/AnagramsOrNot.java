package java_OOPS_Apolis;

import java.util.Arrays;

public class AnagramsOrNot {
	
	public boolean anagramsOrNot(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] char1= s1.toCharArray();
		char[] char2= s2.toCharArray();
		
	
		if(char1==char2) {
			return true;
			}
		return false;
	}

	public static void main(String[] args) {
		AnagramsOrNot obj = new AnagramsOrNot();
		 boolean anagram = obj.anagramsOrNot("race", "care");
		 if(anagram) {
			 System.out.println("Both are Anagrams");
		 }
		 else {
			 System.out.println("Both are NOT Anagrams");
		 }

	}

}
