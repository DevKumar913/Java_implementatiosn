package com.kumar.Strings;

public class RevStringNotUsing3rdVar {
	
	public String revStringNotUsing3rdVar(String str) {
		String revString="";
		for(int i=str.length()-1;i>=0;i--) {
			revString+=str.charAt(i);
		}
		return revString;
	}
	public static void main(String[] args) {
		RevStringNotUsing3rdVar obj = new RevStringNotUsing3rdVar();
		System.out.println(obj.revStringNotUsing3rdVar("hello"));

	}

}
