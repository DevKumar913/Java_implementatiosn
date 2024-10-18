package com.harish.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection2Array_349 {
	
	public int[] intersectionOf2Arrays(int[] arr1, int[] arr2) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			if(searchNumInArray(arr1[i],arr2)==true) {
				if(searchNumInArrayList(arr1[i],arr)==false) {
					arr.add(arr1[i]);
				}
			}
		}
		int[] answer = new int[arr.size()];
		for(int i=0;i<arr.size();i++) {
			answer[i]=arr.get(i);
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
	
	public boolean searchNumInArrayList(int num, ArrayList<Integer> array) {
		for(int a:array) {
			if(a==num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Intersection2Array_349 obj = new Intersection2Array_349();
		int[] intersection=obj.intersectionOf2Arrays(new int[] {3, 2, 5, 8}, new int[] {5, 2, 9});
		System.out.println(Arrays.toString(intersection));
	}
}