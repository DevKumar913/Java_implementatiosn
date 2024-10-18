package com.kumar.apolis_Arrays;

public class MaxDifference {
	public int maxDiffernecArray(int[] array) {
		int max=array[0];
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
		}
		return max-min;
	} 

	public static void main(String[] args) {
		MaxDifference obj =new MaxDifference();
		System.out.println(obj.maxDiffernecArray(new int[] {1,2,3,4,5,6,7,8,9,10}));
	}
}
