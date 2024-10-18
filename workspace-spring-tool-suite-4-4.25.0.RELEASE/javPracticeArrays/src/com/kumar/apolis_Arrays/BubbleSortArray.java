package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class BubbleSortArray {
	
	public int[] bubbleSort(int[] array) {
		int n= array.length;
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(array[j-1]>array[j]) {
					int temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					System.out.println(Arrays.toString(array));
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		BubbleSortArray obj = new BubbleSortArray();
		System.out.println(Arrays.toString(obj.bubbleSort(new int[] {3, 7, 1, 9, 5})));

		

	}

}
