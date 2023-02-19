package LogicalProgram;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();
		
		boolean flag=true;
		
		for(int i=2;i<no;i++) {
			
			if(no%i==0) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
		
	}

}
