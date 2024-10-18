package com.kumar.backtracking_Basics;

import java.util.Arrays;

public class RevArray_2 {
	
	public void revArray(int i,int[] arr, int n) {
		if(i>=n/2) return;
		
		int temp=arr[i];
		arr[i]=arr[n-1-i];
		arr[n-1-i]=temp;
		
		revArray(i+1,arr,n);
		
				
	}
	public void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
		int l=0;
		int r=arr.length;
		RevArray_2 obj = new RevArray_2();
		obj.revArray(l,arr,r);
		obj.print(arr);

	}

}
