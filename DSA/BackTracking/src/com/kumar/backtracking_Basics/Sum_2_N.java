//Parameterized recursion

package com.kumar.backtracking_Basics;

public class Sum_2_N {
	int sum=0;
	public void sumToN(int n) {
		
		if(n<1) {
			System.out.println(sum);
			return;
		}
		sum+=n;
		sumToN(n-1);
	}

	public static void main(String[] args) {
		Sum_2_N obj = new Sum_2_N();
		obj.sumToN(3);

	}

}
