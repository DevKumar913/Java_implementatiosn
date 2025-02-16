package com.kumar.Arrays_Medium;

import java.util.Arrays;

public class NextPermutation {
	
	public int[] nextPermutation(int[] nums) {
		int index=-1;
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i]<nums[i+1]) {
				index=i;
				break;
			}
		}
			
			if(index==-1) {
				return reverse(nums);
			}
			
			for(int i=nums.length-1;i>=index;i--) {
				if(nums[i]>nums[index]) {
					swap(nums,i,index);
					break;
				}
			}
			
			reverse(nums,index+1,nums.length-1);
			return nums;
			
		
		
	}
	
	public int[] reverse(int[] arr, int start, int end) {
		int l=start;
		int r=end;
		while(l<r) {
			swap(arr,l,r);
			l++;
			r--;
		}
		return arr;
	}
	
	
	public int[] reverse(int[] arr) {
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			swap(arr,l,r);
			l++;
			r--;
		}
		return arr;
	}
	
	public void swap(int[] arr, int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	

	public static void main(String[] args) {
		NextPermutation obj = new NextPermutation();
		System.out.println(Arrays.toString(obj.nextPermutation(new int[] {1,2,3})));

	}

}
