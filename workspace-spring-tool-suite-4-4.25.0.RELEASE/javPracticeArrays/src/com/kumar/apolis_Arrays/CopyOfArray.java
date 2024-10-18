package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class CopyOfArray {
	
	public int[] copy(int[] array1, int[] array2) {
		for(int i=0;i<array1.length;i++) {
			if(array1[i]!=array2[i]) {
				array2[i]=array1[i];
			}
		}
		return array2;
	}

	public static void main(String[] args) {
		CopyOfArray obj = new CopyOfArray();
		System.out.println("Copied Array is : "+Arrays.toString(obj.copy(new int[] {3, 7, 1, 9, 5},new int[5])));

	}

}
