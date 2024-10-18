package com.kumar.Arrays_Medium;

import java.util.Arrays;

public class SortColors012__2 {
	
	public int[] sortColors(int[] nums) {

        int c0=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            if(nums[i]==1){
                c1++;
            }
            if(nums[i]==2){
                c2++;
            }
        }
        
        System.out.println(c0);
        System.out.println(c1);
        System.out.println(c2);
        int index=0;
        for(int i=0;i<c0;i++){
                nums[index]=0;
                index++;
        }


        for(int i=0;i<c1;i++){
                nums[index]=1;
                index++;
        }

        for(int i=0;i<c2;i++){
                nums[index]=2;
                index++;
        }   
        
        return nums;
    
    }

	public static void main(String[] args) {
		SortColors012__2 obj = new SortColors012__2();
		int[] result=obj.sortColors(new int[] {2,0,2,1,1,2});
		System.out.println(Arrays.toString(result));
	}

}
