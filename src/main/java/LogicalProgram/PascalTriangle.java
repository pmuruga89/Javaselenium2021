package LogicalProgram;

public class PascalTriangle {
	
	public static int factorial(int n) {

		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		
		return fact;
	}
	
	public static int ncr(int i, int j) {
		
		return factorial(i)/(factorial(i-j)*factorial(j));
	}


	public static void main(String[] args) {

		int i,j;
		
		for(i=0;i<=5;i++) {
			
			
			for(j=0;j<=5-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print(" "+ncr(i,k));
			}
			
			System.out.println();
		}
	}

}
