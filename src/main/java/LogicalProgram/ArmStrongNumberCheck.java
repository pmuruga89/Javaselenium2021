package LogicalProgram;

import java.util.Scanner;

public class ArmStrongNumberCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int temp = n;
		int sum=0,r;
		while(temp!=0) {
			
			r = temp%10;
			sum = sum+r*r*r;
			temp = temp/10;
			
		}
		
		if(n==sum) {
			System.out.println("The number is armstrong");
		}else {
			System.out.println("The number is not armstrong");
		}
	}

}
