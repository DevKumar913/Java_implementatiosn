package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class KthSmallestElemnt {
	
	public int kthSmallestElement(int[] array, int k) {
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=1;j<array.length-i;j++) {
				
				if(array[j-1]>array[j]) {
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}	
			}
		}
		
		return array[k-1];
	}

	public static void main(String[] args) {
		KthSmallestElemnt obj = new KthSmallestElemnt();
		System.out.println(obj.kthSmallestElement(new int[] {3, 7, 1, 9, 5},3));
	}
}
