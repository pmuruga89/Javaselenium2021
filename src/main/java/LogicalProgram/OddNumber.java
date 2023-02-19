package LogicalProgram;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int n = sc.nextInt();
		
//		int ctr=1;
//		while(n>0) {
//			
//			System.out.println(ctr);
//			ctr = ctr+2;
//			n--;
//		}
		
		
		for(int i=1;i<n;i=i+2) {
			System.out.print(i+" ");
		}
		
	}

}
