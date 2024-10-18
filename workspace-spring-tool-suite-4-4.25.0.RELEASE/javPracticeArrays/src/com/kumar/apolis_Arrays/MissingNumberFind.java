package com.kumar.apolis_Arrays;

public class MissingNumberFind {
	
	public int findMissing(int[] array) {
		int min=array[0];
		int max=0;
		int sum=0;
		
		for(int i=0; i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
			sum+=array[i];
		}
		int n=max-min+1;
		int seqsum = (n*(min+max))/2;
		System.out.println(max +" "+min+" "+sum+" "+seqsum);
		return seqsum-sum;
	}

	public static void main(String[] args) {
		MissingNumberFind obj = new MissingNumberFind();
		System.out.println(obj.findMissing(new int[] {10,11,12,13,14,16,17,18,19,20}));
		System.out.println(obj.findMissing(new int[] {1,2,3,4,6,7,8,9,10}));
	}
}
