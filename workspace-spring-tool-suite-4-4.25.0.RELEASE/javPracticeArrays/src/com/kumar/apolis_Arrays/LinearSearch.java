package com.kumar.apolis_Arrays;

public class LinearSearch {
	public void linearSerach(int[] array,int searchElement) {
		int x=-1;
		for(int i=0;i<array.length;i++) {
			if(array[i]==searchElement) {
				x=i;
				break;
			}
		}
		if(x!=-1) {
			System.out.println("Match found at Index no : "+x);
		}
		else {
			System.out.println("Match Not found");
		}	
	}
	public static void main(String[] args) {
		LinearSearch obj = new LinearSearch();
		obj.linearSerach(new int[] {3, 7, 1, 9, 5},5);
		obj.linearSerach(new int[] {3, 7, 1, 9, 5},8);
	}
}