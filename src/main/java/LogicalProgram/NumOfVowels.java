package LogicalProgram;

import java.util.HashMap;
import java.util.Map;

class Delete1{
	
}

public class NumOfVowels {
	
	public static void main(String[] args) {

	
		String s="murugan";
		
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = Character.toLowerCase(s.charAt(i));
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				
				if(hm.containsKey(c)) {
					hm.put(c, hm.get(c)+1);
				}else {
					hm.put(c, 1);
				}
				
			}
		}
		
		for(Map.Entry t: hm.entrySet()) {
			
			System.out.println(t.getKey()+" "+t.getValue());
		}
		
		
	}
}
