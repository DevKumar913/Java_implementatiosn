package javaPracticeDuplicateRemovalInAnArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public int removeDupliate(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		
		Integer[] setToArray = set.toArray(new Integer[set.size()]);
		
		System.out.println(Arrays.toString(setToArray));
		for(int i=0;i<set.size();i++) {
			arr[i]=setToArray[i];
		}
		
		System.out.println(Arrays.toString(arr));
		
		return set.size()-1;
	}

	public static void main(String[] args) {
	

	}

}
