package LogicalProgram;

import java.util.LinkedHashSet;

public class RemoveRepeatedCharFromGivenString {

	public static void main(String[] args) {

		String s = "I am murugan";
		
		LinkedHashSet<Character>hs = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		
		System.out.println(hs);
		
	}

}
