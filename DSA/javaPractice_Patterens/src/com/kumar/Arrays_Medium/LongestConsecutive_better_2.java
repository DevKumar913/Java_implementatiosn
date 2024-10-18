package com.kumar.Arrays_Medium;

import java.util.Arrays;

public class LongestConsecutive_better_2 {
	
	public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int longest=1,count=0,lastSmallest=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSmallest){
                count++;
                lastSmallest=nums[i];
            }
            else if(nums[i]!=lastSmallest){
                count=1;
                lastSmallest=nums[i];
            }

            longest = Math.max(count,longest);
        }
        return longest;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
