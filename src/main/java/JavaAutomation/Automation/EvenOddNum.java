package JavaAutomation.Automation;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		
		for(int i=2;i<=n;i=i+2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		for(int i=1;i<=n;i=i+2) {
			System.out.print(i+" ");
		}
	}

}
