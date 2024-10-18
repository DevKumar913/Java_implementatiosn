package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class MaximumSumSubArray {
	
	public int[] maxSumSubArray(int[] array) {
		
		int start = 0,end = 0,temp=0;
		int maxSum=array[0];
		int currentsum=0;
		
		for(int i=0;i<array.length;i++) {
			
		currentsum+=array[i];
		
		if(currentsum>maxSum) {
			maxSum=currentsum;
			start=temp;
			end=i;
		}
		
		if(currentsum<0) {
			currentsum=0;
			temp=i+1;
			
		}
		}
		return Arrays.copyOfRange(array, start, end+1);
	}

	public static void main(String[] args) {
		MaximumSumSubArray obj = new MaximumSumSubArray();
		System.out.println(Arrays.toString(obj.maxSumSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4})));

	}

}
