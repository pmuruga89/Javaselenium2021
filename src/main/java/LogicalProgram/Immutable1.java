package LogicalProgram;

import java.util.HashMap;
import java.util.Map;

public class Immutable1 {

	public static void main(String[] args) {

		int ctr=0;
		int arr[][] = new int[4][4];
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				
				ctr++;
				arr[i][j]=ctr;
				
			}
		}
		
		for(int k=0;k<4;k++) {
			
			for(int l=0;l<4;l++) {
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
		}
	}

}
