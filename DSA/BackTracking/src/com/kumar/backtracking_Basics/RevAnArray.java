package com.kumar.backtracking_Basics;

import java.util.Arrays;

public class RevAnArray {
	public void revArray(int[] arr, int l,int r) {
		if(l>=r) return;
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		revArray(arr,l+1,r-1);
	}
	
	public void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
		int l=0;
		int r=arr.length-1;
		RevAnArray obj = new RevAnArray();
		obj.revArray(arr,l,r);
		obj.print(arr);

	}

}
