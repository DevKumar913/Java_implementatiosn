package com.kumar.Strings;

public class RevEachWord {
	public void revEachWord(String str) {
		String[] stringArray= str.split("\\s+");
		String finalRev="";
		for(String s :stringArray) {
			char[] schar=s.toCharArray();
			String rev="";
			for(int i=s.length()-1;i>=0;i--) {
				rev+=schar[i];
				
			}
			finalRev+=rev+" ";
		}
		System.out.println(finalRev);
	}

	public static void main(String[] args) {
		RevEachWord obj = new RevEachWord();
		obj.revEachWord("reddy cheddy muddy");;

	}

}
