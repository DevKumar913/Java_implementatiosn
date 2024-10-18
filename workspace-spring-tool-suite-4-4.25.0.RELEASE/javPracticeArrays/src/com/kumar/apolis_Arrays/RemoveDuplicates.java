package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public int[] removeDuplicates(int[] array) {
		int[] res= new int[array.length];
		int index=0;
		for(int i=0;i<array.length;i++) {
			if(searchNumInArray(array[i],res)==false) {
				res[index++]=array[i];
			}
		}
		int[] uniqueArray = new int[index];
		for(int i=0;i<index;i++) {
			uniqueArray[i]=res[i];
		}
		return uniqueArray;
	}
	public boolean searchNumInArray(int num, int[] array) {
		for(int a:array) {
			if(a==num) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		System.out.println(Arrays.toString(obj.removeDuplicates(new int[] {3, 2, 5, 2, 8, 5})));

	}

}
