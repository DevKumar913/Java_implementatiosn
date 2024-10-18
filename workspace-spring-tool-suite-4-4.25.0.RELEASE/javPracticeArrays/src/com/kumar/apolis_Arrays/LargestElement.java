package com.kumar.apolis_Arrays;

public class LargestElement {
	
	public int largestElementArray(int[] array) {
		int lar=0;
		for(int i=1;i<array.length;i++) {
			if(lar<array[i]) {
				lar=array[i];
			}
		}
		return lar;
	}

	public static void main(String[] args) {
		LargestElement obj = new LargestElement();
		System.out.println(obj.largestElementArray(new int[] {1,1,2,3,4,5,6,4,2,4,3,1,51,6,7,8}));
	}

}
