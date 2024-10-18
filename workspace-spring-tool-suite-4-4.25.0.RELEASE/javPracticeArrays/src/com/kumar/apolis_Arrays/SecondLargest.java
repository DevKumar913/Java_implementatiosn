package com.kumar.apolis_Arrays;


public class SecondLargest {
	
	public int secondlargestElementArray(int[] array) {
		int lar=array[0];
//		int seclar=array[0];
//		int thirdlar=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(lar<array[i]) {
//				thirdlar=seclar;
//				seclar=lar;
				lar=array[i];
			}
			
		}
		return lar;
	}

	public static void main(String[] args) {
		SecondLargest obj = new SecondLargest();
		System.out.println(obj.secondlargestElementArray(new int[] {1,2,3,4,5}));
	}

}