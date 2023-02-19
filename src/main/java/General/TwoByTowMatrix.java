package General;

public class TwoByTowMatrix {

	public static void main(String[] args) {

		int arr[][] = new int[3][3];
		
		int ctr=10;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				arr[i][j]=ctr;
				ctr = ctr+10;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {

				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
	} 

}
