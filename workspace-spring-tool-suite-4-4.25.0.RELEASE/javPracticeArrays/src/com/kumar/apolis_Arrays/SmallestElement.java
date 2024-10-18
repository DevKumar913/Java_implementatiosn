package com.kumar.apolis_Arrays;

public class SmallestElement {
	
	public int smallestElementArray(int[] array) {
		int smallest=0;
		for(int i=1;i<array.length;i++) {
			if(smallest>array[i]) {
				smallest=array[i];
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		SmallestElement obj = new SmallestElement();
		System.out.println(obj.smallestElementArray(new int[] {1,1,0,2,3,4,5,6,4,2,4,3,1,51,6,7,8}));
	}

}