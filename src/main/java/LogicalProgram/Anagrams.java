package LogicalProgram;

import java.util.Arrays;
import java.util.TreeMap;

public class Anagrams{
	
	
	public static void main(String args[]) {
		
		String s1 = "muruuan";
		String s2 = "muruaan";
		
		//Not anagrams
		//String s1 = "muruuan";
		//String s2 = "muruaan";

		
		char ch1[] = s1.toLowerCase().toCharArray();
		char ch2[] = s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		s1 = Arrays.toString(ch1);
		s2 = Arrays.toString(ch2);
		
		
		if(s1.length()==s2.length()) {
			boolean flag = false;

			for(int i=0;i<s1.length();i++) {
				
				if(s1.charAt(i)!=s2.charAt(i)) {
					flag =true;
					break;
				}
				
			}
			
			if(flag) {
				System.out.println("Not Anagrams");
			}else {
				System.out.println("Anagrams");
			}
			
			
		}else {
			System.out.println("Not Anagrams");
		}

	}
				
}
