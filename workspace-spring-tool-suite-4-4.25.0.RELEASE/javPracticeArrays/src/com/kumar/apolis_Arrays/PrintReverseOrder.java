package com.kumar.apolis_Arrays;

public class PrintReverseOrder {
	
	public void reverseOrder(int[] array) {
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
			if(i!=0) {
				System.out.print(",");
			}
		}
	}

	public static void main(String[] args) {
		PrintReverseOrder obj =new PrintReverseOrder();
		
		obj.reverseOrder( new int[] {1,2,3,4,5,6,7,8});

	}

}
