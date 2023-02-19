package JavaAutomation.Automation;

import java.util.Scanner;

public class CharAtMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		
		for(int i = 0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
	}

}
