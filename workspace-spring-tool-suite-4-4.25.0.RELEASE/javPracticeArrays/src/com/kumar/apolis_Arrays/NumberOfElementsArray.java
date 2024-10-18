package com.kumar.apolis_Arrays;

public class NumberOfElementsArray {
	public int numberOfElements(int[] array) {
		int c=0;
			while(true) {
				try {
					int x=array[c];
					c++;
					
				}catch(ArrayIndexOutOfBoundsException e) {
					break;
				}
			}
		return c;	
	}
	public static void main(String[] args) {
		NumberOfElementsArray obj =new NumberOfElementsArray();
		System.out.println(obj.numberOfElements(new int[] {2,4,3}));
	}
}