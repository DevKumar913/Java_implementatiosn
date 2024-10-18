package java_OOPS_Apolis;

public class FirstPeak {
	
	public int firstPeak(int[] arr) {
		
		int n= arr.length;
		
		if(n==1) {
			return arr[0];
		}
		
		for(int i=1;i<n-1;i++) {
			if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]) {
				return arr[i];
			}
		}
		
		if(arr[n-1]>arr[n-2]) {
			return arr[n-1];
		}
		return -1;
	}
	public static void main(String[] args) {
		FirstPeak obj = new FirstPeak();
		System.out.println(obj.firstPeak(new int[] {1, 3, 5, 2, 4, 6, 8}));		
	}
}
