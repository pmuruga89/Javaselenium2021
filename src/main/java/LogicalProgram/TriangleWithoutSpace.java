package LogicalProgram;

public class TriangleWithoutSpace {

	public static void main(String[] args) {
		
		int ctr=0;
		for(int i=0;i<=5;i++) {
			
			for(int k=0;k<=i;k++) {
				ctr++;
				System.out.print(ctr+" ");
			}
			System.out.println();
		}
	}

}
