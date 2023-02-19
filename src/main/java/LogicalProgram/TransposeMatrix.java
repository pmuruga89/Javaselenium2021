package LogicalProgram;

public class TransposeMatrix {

	public static void main(String[] args) {

		int arr[][] = new int[3][3];
		
		int ctr = 10;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				arr[i][j] = ctr;
				ctr = ctr+10;
			}
		}
		//Before transpose
		for(int k=0;k<arr.length;k++) {
			for(int l=0;l<arr.length;l++) {
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
		}
		
		//Arranging the array value
		
		for(int m=0;m<arr.length;m++) {
			
			for(int n=0;n<m;n++) {
				
				int temp = arr[n][m];
				
				arr[n][m]=arr[m][n];
				arr[m][n]= temp;
			}
		}
		
		//After transpose
		System.out.println("After transpose");
		for(int k=0;k<arr.length;k++) {
			for(int l=0;l<arr.length;l++) {
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
		}
	}

}
