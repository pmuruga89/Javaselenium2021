package LogicalProgram;

import java.util.Arrays;
import java.util.Scanner;

public class NumberStringSorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String s1 = sc.nextLine();
		
		String a ="";
		String b = "";
		
		for(int i = 0; i<s1.length();i++) {
			
			if(Character.isLetter(s1.charAt(i))){
				a = a+s1.charAt(i);
			}else {
				b = b+s1.charAt(i);
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(":::::::::: Number and String reverse :::::::");
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.append(a).reverse());
		sb.setLength(0);
		System.out.println(sb.append(b).reverse());
		
		System.out.println("::::::::::: Reverse ::::::::::::");
		char ch1[] = a.toCharArray();
		char ch2[] = b.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int j=0;j<ch1.length;j++) {
			System.out.print(ch1[j]);
		}
		System.out.println();
		for(int j=0;j<ch2.length;j++) {
			System.out.print(ch2[j]);
		}
		
	}

}
