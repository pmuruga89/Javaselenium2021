package LogicalProgram;

import java.util.Scanner;

public class ProductofSumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int prod =1;
		
		for(int i=1;i<=n;i++) {
			
			prod = prod*i;
		}
		
		System.out.println(prod);
		
	}

}
