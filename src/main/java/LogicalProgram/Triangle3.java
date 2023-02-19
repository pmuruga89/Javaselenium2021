package LogicalProgram;

public class Triangle3 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			
			for(int j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=i;k<=i;k++) {
			
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
//		0 
//		  1 
//		   2 
//		    3 
//		     4 
//		      5 
		
//		for(int i=0;i<=5;i++) {
//			
//			for(int j=5;j>=5-i;j--) {
//				System.out.print(" ");
//			}
//			
//			for(int k=i;k<=i;k++) {
//			
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}

	}

}
