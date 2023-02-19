package LogicalProgram;

import java.util.Scanner;

public class ArmStrongNumberCheckUsingInbuildFun {

	public static void main(String[] args) {

		//1st way
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String s = Integer.toString(n);
		
		int sum = 0;
		
		for(int i=0;i<s.length();i++) {
			
			int a = Character.getNumericValue(s.charAt(i));
			
			sum = sum + (int)Math.pow(a,3);
		}
		
		if(n==sum) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
	}

}
