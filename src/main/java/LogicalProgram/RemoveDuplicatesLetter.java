package LogicalProgram;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		//Using char
		
		// to include last index
		s = s.concat(" ");
		
		char ch[] = s.toCharArray();
		String withoutDup = "";
		LinkedHashSet<Character>hs = new LinkedHashSet<Character>();
		for(int i=0;i<=ch.length; i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
				}else {
					//withoutDup = withoutDup+ch[i];
					hs.add(ch[i]);
					//Iterator<Character> it = hs.iterator();
					//withoutDup = withoutDup + it.next();
					//hs.clear();
					//System.out.println(hs);

				}
			}
		}
		
		System.out.println(hs);
		
		
		
		
		
		
		//----------------------
		LinkedHashSet<Character>lh = new LinkedHashSet<Character>();
		String m = "murugan";
		for(int i=0;i<m.length();i++) {
			
			lh.add(m.charAt(i));
		}
		
		for(Object temp:lh.toArray()) {
			System.out.println(temp);
		}
		
		
		
	}

}
