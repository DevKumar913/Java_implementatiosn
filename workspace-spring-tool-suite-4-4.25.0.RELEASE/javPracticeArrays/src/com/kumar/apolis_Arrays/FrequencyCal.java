package com.kumar.apolis_Arrays;

import java.util.Arrays;

public class FrequencyCal {
	
	public void frequencycount(int[] array) {
		boolean[] check = new boolean[array.length];
		Arrays.fill(check, false);
		
		for(int i=0;i<array.length;i++) {
			int c=1;
			if(check[i]){
				continue;
			}
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					c++;
					check[j]=true;
				}
			}
			System.out.println(array[i]+ " Repeated "+ c+" times");
			
			
		}
	}
	public static void main(String[] args) {
		FrequencyCal obj= new FrequencyCal();
		obj.frequencycount(new int[] {1,1,2,3,4,5,6,4,2,4,3,1,5,6,7,8});
	}
	
}
