package LogicalProgram;

import java.util.Scanner;

public class EvenAddWithoutUsing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		while(n>2) {
			n = n-2;
		}
		
		if(n==1) {
			System.out.println("The number is odd");
		}if(n==2) {
			System.out.println("The number is even");
		}
		
	}

}
