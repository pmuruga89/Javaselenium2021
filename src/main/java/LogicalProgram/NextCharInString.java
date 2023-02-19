package LogicalProgram;

import java.util.Scanner;

public class NextCharInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String str = "";
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			++c;
			str = str+c;
		}
		System.out.print(str);
	}

}
