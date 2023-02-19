package LogicalProgram;

import java.util.Scanner;

public class PalindromUsingString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();
		
		String temp = "";
		
		for(int i=s1.length()-1;i>=0;i--) {
			temp = temp + s1.charAt(i);
		}
		
		
		if(s1.equalsIgnoreCase(temp)) {
			System.out.println("The string is palindrom");
		}else {
			System.out.println("The string is not palindrom");
		}
	}

}
