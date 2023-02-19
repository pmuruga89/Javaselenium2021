package LogicalProgram;

import java.util.HashSet;
import java.util.Iterator;

public class NumberReverse {

	public static void main(String[] args) {

		//1st
		
		int n=35571;
		
		String s = Integer.toString(n);
		String temp = "";
		for(int i=s.length()-1;i>=0;i--) {
			temp = temp+s.charAt(i);
		}
		
		System.out.println(temp);
		
		System.out.println("============");
		
		//2nd way
		StringBuffer sb = new StringBuffer();
		sb.append(n);
		
		sb.reverse();
		System.out.println(sb);
		
		
		// 3rd way
		int reverse =0;
		while(n>0) {
			
			int r = n%10;
			reverse = reverse * 10+r;
			n = n/10;
		}
		System.out.println("Reverse: "+reverse);
		
	}

}
