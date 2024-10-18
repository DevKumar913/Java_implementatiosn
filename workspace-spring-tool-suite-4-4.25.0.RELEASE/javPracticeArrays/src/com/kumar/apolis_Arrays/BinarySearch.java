package com.kumar.apolis_Arrays;

public class BinarySearch {
	
	public int  binarySearchArray(int[] array, int targetElement) {
		int start=0;
		int end=array.length-1;
		int x=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(array[mid]==targetElement) {
				return mid;
			}
			else if(array[mid]<targetElement) {
				start=mid+1;
			}
			else if(array[mid]>targetElement) {
				end =mid-1;
			}
		}
		return x;
		
	}
	
	public static void main(String args[]) {
		BinarySearch obj = new BinarySearch();
		int x=obj.binarySearchArray(new int[] {1,2,3,4,5},6);
		
		
		if(x!=-1) {
			System.out.println("Found the match at : " + x);
		}
		else {
			System.out.println("Match Not Found ");
		}
	}

}
