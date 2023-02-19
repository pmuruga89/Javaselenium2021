package LogicalProgram;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int arr[] = {20, 50, 10, 601, 30, 90, 15};
		
		
		//2nd highest number
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
		//Bubble sort
		int arr1[] = {20, 50, 10, 601, 30, 90, 15};
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=i+1;j<arr1.length;j++) {
				
				if(arr1[i]>arr1[j]) {
					int temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		
		System.out.println(arr1[arr1.length-2]);
	}

}
