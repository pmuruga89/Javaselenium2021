package LogicalProgram;

import java.util.Scanner;

public class UpperCamelCase {

	 static int k;
	public static void main(String[] args) {

		//String s = "My Name is Murugan";
		k=10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();

		char ch[] = s.toCharArray();
		
		String s1 ="";
		
		for(int i=0;i<ch.length;i++) {
			
			
			if(i==0) {
				
				ch[i] = Character.toUpperCase(ch[i]);
				s1 = s1 + String.valueOf(ch[i]);
			}else if(ch[i]==' ') {
				
				char c = Character.toUpperCase(ch[++i]);
				s1 = s1 + String.valueOf(c);
			}else {
				s1 = s1 + String.valueOf(ch[i]);
			}
		}
		
		System.out.println(s1);
	}

}
