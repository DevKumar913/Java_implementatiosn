package com.kumar.apolis_Arrays;

public class SumOfItems {
	public int sum(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfItems obj = new SumOfItems();
		System.out.println("Sum of the items is : "+obj.sum(new int[] {2,4,3}));

	}

}
