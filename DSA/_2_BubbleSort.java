package main;

public class _2_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9,7,8,1,3,5,8,2,0};
		bubbleSort(arr);

	}
	
	static void bubbleSort(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}
}
