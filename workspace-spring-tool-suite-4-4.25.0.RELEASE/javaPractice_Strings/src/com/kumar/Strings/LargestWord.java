package com.kumar.Strings;

public class LargestWord {
	public String largestWord(String str) {
		
		String[] strarray = str.split("\\s");
		int index=0;
		for(int i=0;i<strarray.length;i++) {
			int maxlength=0;
			if(strarray[i].length()>maxlength) {
				maxlength=strarray[i].length();
				index=i;
			}
			
		}
		return strarray[index];
	}

	public static void main(String[] args) {
		LargestWord obj = new LargestWord();
		System.out.println(obj.largestWord("This is a sample sentence"));

	}

}
