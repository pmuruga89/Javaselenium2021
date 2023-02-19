package LogicalProgram;

import java.util.Arrays;

public class NumberSorting {

	public static void main(String[] args) {

		
		int n = 9823141;
		
		String s = Integer.toString(n);
		char ch[] = new char[s.length()];
		ch = s.toCharArray();
		
		Arrays.sort(ch);
		
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}

}
