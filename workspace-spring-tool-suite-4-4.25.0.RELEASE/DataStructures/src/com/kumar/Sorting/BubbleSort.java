package com.kumar.Sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public int[] bubbleSort(int[] array) {		
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length-i;j++) {
				if(array[j-1]>array[j]) {
					swap(array,j,j-1);
				}
				System.out.println(Arrays.toString(array));
			}
		}
		return array;
	}
	public void swap(int[] array, int i, int j){
		int temp= array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		System.out.println(Arrays.toString(obj.bubbleSort(new int[] {3, 7, 1, 9, 5})));
	}
}