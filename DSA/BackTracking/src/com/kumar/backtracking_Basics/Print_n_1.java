package com.kumar.backtracking_Basics;

public class Print_n_1 {
	
	public void print_n_1(int n, int i) {
		if(n<1) return;
		print_n_1(n-1,i);
		System.out.println(i-n+1);
	}

	public static void main(String[] args) {
		Print_n_1 obj = new Print_n_1();
		obj.print_n_1(3,3);

	}

}
