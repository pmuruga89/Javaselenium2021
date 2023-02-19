package LogicalProgram;

import java.util.Scanner;

public class TwoIntegerAreEvenOrAdd {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter no2: ");
		int n2 = sc.nextInt();
		
		
		if(n1%2==0 && n2%2==0) {
			System.out.println("n1 and n2 are even");
		}else if(n1%2==0 || n2%2!=0) {
			System.out.println("n1 is even and n2 is not even");
		}else if(n2%2==0 || n2%1!=0) {
			System.out.println("n1 is not even and n2 is even");
		}
		
		
	}

}
