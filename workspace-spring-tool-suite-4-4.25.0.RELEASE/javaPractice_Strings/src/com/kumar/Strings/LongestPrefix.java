package com.kumar.Strings;

public class LongestPrefix {
	
	public String longestPrefix(String[] strs) {
		if(strs==null || strs.length==0) {
			return "No valid strings are given";
		}
		String prefix = strs[0];
		for(int i=1;i<strs.length;i++) {
			while(strs[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0,prefix.length()-1);
				
				if(prefix.length()==0) {
					return "No common prefix avilable";
				}
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		LongestPrefix prefix = new LongestPrefix();
		System.out.println(prefix.longestPrefix(new String[] {"apple", "appetite", "apprehend"}));
	}
}