package com.harish.leetcode;

import java.util.Scanner;

public class StringWordsRev {
	
//	String[] StringToWords() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("something");
//		String s = sc.nextLine();
//		String[] words = s.split("[\\s]");
//		return words;
//	}
	String RevWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("something");
		String s = sc.nextLine();
	
		String[] words = s.trim().split("\\s+");
		String rev="";
		for(int i=0;i<words.length/2;i++) {
			String temp=words[i];
			words[i]=words[words.length-i-1];
			words[words.length-i-1]=temp;
		}
		for(String word: words) {
			rev+=word+" ";
		}
		return rev.trim();
		
	}
	

	public static void main(String[] args) {
		StringWordsRev ob1 = new StringWordsRev();
		
		System.out.println(ob1.RevWords());

	}

}
