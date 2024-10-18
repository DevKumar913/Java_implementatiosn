package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class PeakElementsInArray {
	
	public int[] findThePeak(int[] array) {
		int n= array.length;
		int[] temp =new int[n];
		int peakCount=0;
		
		if(n==1) {
			return array;
		}
		
		if(n>1 && array[0]>array[1]) {
			temp[peakCount++]=array[0];
		}
		
		for(int i=1;i<n-1;i++) {
			if(array[i]>array[i-1] && array[i]>array[i+1]) {
				temp[peakCount++]=array[i];
			}
		}
		
		if(n>1 && array[n-1]>array[n-2]) {
			temp[peakCount++]=array[n-1];
		}
		
		int[] peak = new int[peakCount];
		
		for(int i=0;i<peak.length;i++) {
			peak[i]=temp[i];
		}
		return peak;
	}
	
	public int firstPeak(int[] array) {
		int n= array.length;
		if(n==1) {
			return array[0];
		}
		
		if(n>1 && array[0]>array[1]) {
			return array[0];
		}
		
		for(int i=1;i<n-1;i++) {
			if(array[i]>array[i-1] && array[i]>array[i+1]) {
				return array[i];
			}
		}
		
		if(n>1 && array[n-1]>array[n-2]) {
			return array[n-1];
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		PeakElementsInArray obj = new PeakElementsInArray();
		int[] peakArray=obj.findThePeak(new int[] {1, 3, 5, 2, 4, 6, 8});
		System.out.println("Peak Array"+Arrays.toString(peakArray));
		System.out.println("First Peak of the Array is "+obj.firstPeak(new int[] {1, 3, 5, 2, 4, 6, 8}));
	}

}
