package LogicalProgram;

import java.util.HashSet;
import java.util.Iterator;

public class Dumm {

	public static void main(String args[]) {
	

		HashSet<Character>hs = new HashSet<Character>();
		hs.add('a');
		hs.add('b');
		hs.add('c');
		
		String s = hs.toString();


		Iterator<Character>itr = hs.iterator();
		
		String s1="";
		while(itr.hasNext()) {
			
			s1 = s1+itr.next();
		}
		System.out.println(s1);
		
	}
}
