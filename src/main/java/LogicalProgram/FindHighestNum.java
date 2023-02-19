package LogicalProgram;

import java.util.Arrays;

public class FindHighestNum {

	public static void main(String[] args) {

		int no[] = {34, 54, 12, 91, 49, 100, 46, 28};
		
		int arr[] = Arrays.copyOf(no, no.length);
		
		//1st way
		//Arrays.sort(no);
		System.out.println(no[no.length-1]);
		
		//2nd way
		for(int i=0;i<no.length;i++) {
			
			for(int j = i+1; j<no.length;j++) {
				
				if(no[i]>no[j]) {
					int temp = no[i];
					no[i]=no[j];
					no[j]=temp;
				}
			}
		}
		System.out.println("Highest no: "+no[no.length-1]);

		//find index position of highest no
		
		int highestNo = no[no.length-1];
		int index = 0;
		
		for(int m = 0;m<no.length;m++) {
			
			if(highestNo == arr[m]) {
				index = m;
			}
		}
		
		System.out.println("Index: "+index);
	}

}
