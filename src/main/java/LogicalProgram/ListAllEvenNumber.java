package LogicalProgram;

import java.util.Scanner;

public class ListAllEvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num:");
		int a = sc.nextInt();//5
		System.out.println("Enter 2nd num:");
		int b = sc.nextInt();//10
		
		for(int i =a;i<=b;i++) {
			
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
