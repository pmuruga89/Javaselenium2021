package LogicalProgram;

import org.bouncycastle.util.Arrays;

public class ArraySplit {

	public static void main(String[] args) {

		int arr[] = {20, 10, 40, 30, 50, 05};
		
		int arr1[] = Arrays.copyOfRange(arr, 1, 3);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}
