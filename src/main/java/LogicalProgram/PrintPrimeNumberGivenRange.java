package LogicalProgram;

import java.util.Scanner;

public class PrintPrimeNumberGivenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i, j;
		for(i=1;i<num;i++) {
			
			for(j=2;j<i;j++) {
				
				int n = i%j;
				if(n==0) {
					break;
				}
			}
			
			if(i==j) {
				System.out.println(i);
			}
		}
	}

}
