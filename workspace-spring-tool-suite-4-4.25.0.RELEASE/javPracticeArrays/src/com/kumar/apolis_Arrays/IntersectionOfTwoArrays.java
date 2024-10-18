package com.kumar.apolis_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
	
		public int[] intersectionOf2Arrays(int[] arr1, int[] arr2) {
			//ArrayList<Integer> arr = new ArrayList<Integer>();
			int size=Math.min(arr1.length-1, arr2.length-1);
			int[] arr = new int[size];
			int index=0;
			
			for(int i=0;i<arr1.length;i++) {
				if(searchNumInArray(arr1[i],arr2)==true) {
					if(searchNumInArray(arr1[i],arr)==false) {
						//arr.add(arr1[i]);
						arr[index]=arr1[i];
						index++;
					}
				}
			}
			int[] answer = new int[index];
			for(int i=0;i<index;i++) {
				answer[i]=arr[i];
			}
			
			return answer;
			
		}
		
		public boolean searchNumInArray(int num, int[] array) {
			for(int a:array) {
				if(a==num) {
					return true;
				}
			}
			return false;
		}
		
//		public boolean searchNumInArrayList(int num, ArrayList<Integer> array) {
//			for(int a:array) {
//				if(a==num) {
//					return true;
//				}
//			}
//			return false;
//		}
	public static void main(String[] args) {
		IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
		int[] intersection=obj.intersectionOf2Arrays(new int[] {3, 2, 5, 8}, new int[] {5, 2, 9});
		System.out.println(Arrays.toString(intersection));
	}
}

