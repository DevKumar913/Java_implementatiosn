package com.kumar.apolis_Arrays;

public class PrintEvenPositions {
	
	public void printEvenPos(int[] array) {
		for(int i=1;i<array.length ;i+=2) {
				System.out.print(array[i]);
			if(i<array.length-2) {
				System.out.print(",");
			}
		}
	}

	public static void main(String[] args) {
		PrintEvenPositions obj = new PrintEvenPositions();
		obj.printEvenPos(new int[] {1,2,3,4,5,6,7});

	}

}
