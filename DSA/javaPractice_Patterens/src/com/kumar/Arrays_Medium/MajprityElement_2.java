package com.kumar.Arrays_Medium;

import java.util.HashMap;
import java.util.Map;

public class MajprityElement_2 {
	
	public int majorityElement(int[] nums) {
		
		int res=0,majority=0;
		
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int n: nums){
            map.put(n, 1+map.getOrDefault(n, 0));
            if(map.get(n)>majority) {
            	res=n;
            	majority=map.get(n);
            }
        }
        return res;
	}

	public static void main(String[] args) {
		

	}

}
