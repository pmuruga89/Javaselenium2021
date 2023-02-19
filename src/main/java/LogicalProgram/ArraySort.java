package LogicalProgram;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {

		int arr[] = {01, 23, 12, 77, 45, 42};
		
//		Arrays.sort(arr);
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
		System.out.println("____________");
		
		int a=142309834;
		
		String s = Integer.toString(a);
		
		System.out.println(s);
		
		char aa[] = new char[s.length()];
		
		for(int l=0;l<aa.length;l++) {
			aa[l]= s.charAt(l);
		}

		Arrays.sort(aa);
		
		
		for(int m=0;m<aa.length;m++) {
			System.out.print(aa[m]+" ");
		}
		
		System.out.println("+++++++Bubble sort++++++");
		
		for(int p=0;p<aa.length;p++) {
			
			for(int q=p+1;q<aa.length;q++) {
				
				if(aa[p]>aa[q]) {
					char temp = aa[p];
					aa[p]=aa[q];
					aa[q]=temp;
				}
			}
		}
		
		for(int r=0;r<aa.length;r++) {
			System.out.print(aa[r]+" ");
		}
	}

}
