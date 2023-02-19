package Exception1;

import java.util.Scanner;

public class UncheckedException extends Exception{


	UncheckedException(String str){
		System.out.println(str);
	}

	public static void main(String[] args) throws UncheckedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int n = sc.nextInt();
		
		if(n>=60|n<=0) {
			
			throw new UncheckedException("Exception -- your are not eligible for vote");
			
		}
		
		System.out.println("You are eligible for vote");
	}

}
