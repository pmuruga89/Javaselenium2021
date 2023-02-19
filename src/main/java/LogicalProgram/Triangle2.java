package LogicalProgram;

public class Triangle2 {

	public static void main(String[] args) {
		int ctr=0;
		for(int i=0;i<=5;i++) {
			
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				ctr++;
				System.out.print(ctr+" ");
			}
			System.out.println();
		}
	}

}
