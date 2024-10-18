package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class SeperateEvenOdd {
	
	public void seperateEvenOdd(int[] array) {
		
		int evenSize=0;
		int oddSize=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				evenSize++;
			}
			else {
				oddSize++;
			}
		}
		
		System.out.println("Even Array Size: "+evenSize);
		System.out.println("Odd Array Size: "+oddSize);
		
		int[] evenArray = new int[evenSize];
		int[] oddArray = new int[oddSize];
		int e=0;
		int od=0;
		for(int i=0;i<array.length;i++) {
			
			if(array[i]%2==0) {
				evenArray[e]=array[i];
				e++;
			}
			else {
				oddArray[od]=array[i];
				od++;
			}
		}
		System.out.println("Even Array : "+ Arrays.toString(evenArray));
		System.out.println("Odd Array : "+ Arrays.toString(oddArray));
	}
	public static void main(String[] args) {
		SeperateEvenOdd obj = new SeperateEvenOdd();
		obj.seperateEvenOdd(new int[] {1,2,3,4,5,6,7,8,9});
	}
}
