package com.kumar.backtracking_Basics;

public class Print1_n {
	public void printNum(int n) {
		
		if(n<1) return;
		
		printNum(n-1);
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		Print1_n obj = new Print1_n();
		obj.printNum(3);

	}

}
