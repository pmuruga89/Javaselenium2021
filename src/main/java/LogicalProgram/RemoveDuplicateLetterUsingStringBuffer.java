package LogicalProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RemoveDuplicateLetterUsingStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		sb.append(s);
		
		for(int i=0;i<sb.length();i++) {
			
			for(int j=i+1;j<sb.length();j++) {
				
				if(sb.charAt(i)==sb.charAt(j)) {
					sb.deleteCharAt(j);
					
				}
			}
		}
		
		System.out.println(sb);
		
	}

}
