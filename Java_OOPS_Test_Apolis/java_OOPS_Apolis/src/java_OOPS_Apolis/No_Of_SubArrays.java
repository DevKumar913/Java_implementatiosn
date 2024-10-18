package java_OOPS_Apolis;

public class No_Of_SubArrays {
	public int noOfSubArrays(int[] arr, int k) {
		int n =arr.length;
		int count=0;
		for(int s=0;s<n;s++) {
			int sum=0;
			for(int e=s;e<n;e++) {
				sum += arr[e];
				if(sum==k) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		No_Of_SubArrays obj = new No_Of_SubArrays();
		System.out.println(obj.noOfSubArrays(new int[] {1, 1, 1}, 2));		
	}
}
