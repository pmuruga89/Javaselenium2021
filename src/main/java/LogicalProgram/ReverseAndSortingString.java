package LogicalProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndSortingString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		//Reverse string
		StringBuffer sb1 = new StringBuffer();
		sb1.append(s);
		sb1.reverse();
		System.out.println(sb1);
		
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--) {
			
			s1 = s1+s.charAt(i);
		}
		
		System.out.println(s1);
		
		
		//String sorting
		System.out.println("::::::::::::Sorting::::::::::::");
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		for(int j=0;j<ch.length;j++) {
			System.out.print(ch[j]);
		}
		System.out.println();
		
		//Without using sorting
		for(int k=0;k<ch.length;k++) {
			
			for(int l=k+1;l<ch.length;l++) {
				
				if(ch[k]>ch[l]) {
					char temp = ch[k];
					ch[k] = ch[l];
					ch[l]=temp;
				}
			}
		}
		
		for(int m=0;m<ch.length;m++) {
			
			System.out.print(ch[m]);
		}
	}

}
