package LogicalProgram;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s1.length();i++) {
			sb.append(s1.charAt(i));
		}
		sb.reverse();

		String s2 = sb.toString();
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equals(s2)){
			System.out.println("String is Palindrom");
		}else {
			System.out.println("String is not a Palindrom");
		}
		
	}

}
