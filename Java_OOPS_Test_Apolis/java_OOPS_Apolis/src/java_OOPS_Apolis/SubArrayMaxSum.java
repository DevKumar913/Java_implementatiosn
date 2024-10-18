package java_OOPS_Apolis;

import java.util.Arrays;

public class SubArrayMaxSum {
	
	public int[] subArray(int[] arr) {
		int maxSum=arr[0];
		int sum=arr[0];
		
		int start=0,end=0,temp=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>sum+arr[i]) {
				sum=arr[i];
				temp=i;
			}
			else {
				sum=sum+arr[i];
			}
			
			if(sum>maxSum) {
				maxSum=sum;
				start=temp;
				end=i;
			}
		}
		
		int[] subArray= new int[end-start+1];
		for(int i=start;i<=end;i++) {
			subArray[i-start]=arr[i];
		}
		return subArray;
	}

	public static void main(String[] args) {
		SubArrayMaxSum obj = new SubArrayMaxSum();
		int[] subArray = obj.subArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4});
		System.out.println(Arrays.toString(subArray));

	}

}
