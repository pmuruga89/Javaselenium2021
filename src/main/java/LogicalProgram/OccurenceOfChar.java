package LogicalProgram;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OccurenceOfChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		
		char c[] = s.toCharArray();
		
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<c.length;i++) {
			
			
			if(hm.containsKey(c[i])) {
				
				hm.put(c[i], hm.get(c[i])+1);
			}else {
				hm.put(c[i], 1);
			}
		}
		
		for(Entry<Character, Integer> temp:hm.entrySet()) {
			System.out.println(temp.getKey() +" "+temp.getValue());
		}
	}

}
