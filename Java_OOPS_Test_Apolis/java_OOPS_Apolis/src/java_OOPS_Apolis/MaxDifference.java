package java_OOPS_Apolis;


public class MaxDifference {
		
		public int maxDifference(int[] arr) {
			for(int i=0;i<arr.length-1;i++) {
				for(int j=1;j<arr.length-i;j++) {
					if(arr[j-1]>arr[j]) {
						int temp=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
			}
			return arr[arr.length-1]-arr[0];
		}

		public static void main(String[] args) {
			MaxDifference obj = new MaxDifference();
			int maxDifference=obj.maxDifference(new int[] {4, 2, 10, 8, 7});
			System.out.println(maxDifference);
		}
}