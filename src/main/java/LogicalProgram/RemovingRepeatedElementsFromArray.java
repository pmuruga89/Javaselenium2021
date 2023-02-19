package LogicalProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class RemovingRepeatedElementsFromArray {

	public static void main(String[] args) {

		//Remove repeated char
		
		char c[] = {'a', 'b', 'm', 'a', 'm','j','b', '1', '1'};
		HashSet<Character>hs = new HashSet<Character>();
		for(int i=0;i<c.length;i++) {
			hs.add(c[i]);
		}
		System.out.println(hs);
		
		
		//without using HashSet
		
		String s="";
		
		for(int i=0;i<c.length;i++) {
			
			String temp = String.valueOf(c[i]);
			if(!s.contains(temp)) {
				s = s+temp;
			}
		}
		
		
		System.out.println(s);
	}

}
