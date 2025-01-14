package java_OOPS_Apolis;

import java.util.Arrays;

public class BubbleSort {
	
	public int[] bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int[] sortedArray=obj.bubbleSort(new int[] {3, 7, 1, 9, 5});
		System.out.println(Arrays.toString(sortedArray));
	}

}
