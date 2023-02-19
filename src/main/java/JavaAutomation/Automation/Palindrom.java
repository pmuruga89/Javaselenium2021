package JavaAutomation.Automation;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string:");
		String s = sc.nextLine();

		String s2 = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		
		System.out.println("Reverse: "+s2);
		
		if(s2.equalsIgnoreCase(s)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("Not palindrom");
		}
		
		
	}

}
