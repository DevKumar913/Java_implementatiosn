package com.kumar.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>=j) {
					System.out.print(i+1);
				}
				
			}
			System.out.println();
		}

	}

}
/*

1
22
333
4444
55555


*/