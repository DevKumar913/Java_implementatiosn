package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class UnionOfTwoArrays {
	
	public void unionOfTwoArrays(int[] array1, int[] array2) {
		
		 int[] temp =new int[array1.length+array2.length];
		 int index=0;
		 
		for(int i=0;i<array1.length;i++) {
			temp[index]=array1[i];
			index++;
			}
		
		for(int i=0;i<array2.length;i++) {
			if(!isPresent(temp,array2[i],index)) {
				temp[index]=array2[i];
				index++;
				}
			}
		
		int[] union = new int[index];
		for(int i=0;i<union.length;i++) {
			union[i]=temp[i];
		}
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(union));
		}
	
	public boolean isPresent(int[] array,int element, int size) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==element) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		UnionOfTwoArrays obj = new UnionOfTwoArrays();
		obj.unionOfTwoArrays(new int[] {3, 2, 5, 8}, new int[] {5,7,9});
		

	}

}
