package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class SelectionSortTech_1 {
	
	public int[] selectionSort_1(int[] array){
		System.out.println(Arrays.toString(array));
		int i,j,temp;
		
		for(i=0;i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				System.out.println(Arrays.toString(array));
			}
		}
		
		return array;
	}

	public static void main(String[] args) {
		
		SelectionSortTech_1 obj = new SelectionSortTech_1();
		System.out.println(Arrays.toString(obj.selectionSort_1(new int[] {3, 7, 1, 9, 5})));

	}

}
