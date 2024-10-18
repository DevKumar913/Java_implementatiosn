package com.kumar.Arrays_Medium;

public class LongestConsecutive_BruteForce {
	
	public int longestConsecutive(int[] nums) {

        int longest=1;
        int n= nums.length;

        if(nums.length==0){
            return 0;
        }

        for(int i=0;i<n;i++){
            int count=1;
            int x=nums[i];

            while(linerSearch(nums,x+1)==true){
                x+=1;
                count++;
            }
            longest=Math.max(count,longest);
        }
        return longest;
    }

     public boolean linerSearch(int[] a, int n){
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
