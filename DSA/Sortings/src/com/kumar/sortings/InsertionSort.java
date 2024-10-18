package com.kumar.sortings;

public class InsertionSort {
	
	public void insertionSort(int[] arr) {
		
		int n= arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				
				int temp =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				
				j--;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

	public static void main(String[] args) {
		InsertionSort obj = new InsertionSort();
		obj.insertionSort(new int[] {13,46,24,52,20,9});
		
		

	}

}
