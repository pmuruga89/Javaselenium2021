package LogicalProgram;

public class ThreebyThreeMatrix {

	public static void main(String[] args) {

		int mat[][]	= 	new int[3][3];
		int no = 10;
		for(int i=0;i<mat.length;i++) {
			
			for(int j=0;j<mat.length;j++) {
				
				
				
				mat[i][j]=no;
				
				no = no+10;
			}
		}
		
		for(int k=0;k<mat.length;k++) {
			for(int l=0;l<mat.length;l++) {
				
				System.out.print(mat[k][l]+" ");
			}
			System.out.println();
		}
	}

}
