//functional recursion

package com.kumar.backtracking_Basics;

public class Sum_2_N_2 {
	public int  sum_2_N_2(int n) {
		if(n==0) return 0;
		return n+sum_2_N_2(n-1);
	}

	public static void main(String[] args) {
		Sum_2_N_2 obj =new Sum_2_N_2();
		int sum=obj.sum_2_N_2(3);
		System.out.println(sum);

	}

}