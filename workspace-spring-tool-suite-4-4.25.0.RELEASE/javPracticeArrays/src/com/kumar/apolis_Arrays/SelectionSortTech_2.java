package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class SelectionSortTech_2 {
	public int[] selectionSort_2(int[] array) {
		System.out.println(Arrays.toString(array));
		for(int i=0;i<array.length;i++) {
			
			int index=i;
			
			for(int j=i+1;j<array.length;j++) {
				if(array[index]>array[j]) {
					index=j;
				}
			}
			int smallestNum=array[index];
			array[index]=array[i];
			array[i]=smallestNum;
		}
		
		return array;
	}

	public static void main(String[] args) {
		SelectionSortTech_2 obj = new SelectionSortTech_2();
		System.out.println(Arrays.toString(obj.selectionSort_2(new int[] {3, 7, 1, 9, 5})));

		

	}

}
