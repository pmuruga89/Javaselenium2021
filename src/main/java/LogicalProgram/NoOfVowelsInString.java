package LogicalProgram; 

import java.util.HashMap;
import java.util.Map;


public class NoOfVowelsInString {

	public static void main(String[] args) {
		

		String s = "murugan";
		char c[] = s.toCharArray();
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		for(int i=0;i<c.length;i++) {
			
			char ch = Character.toLowerCase(c[i]);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				
				if(hm.containsKey(ch)) {
					hm.put(ch, hm.get(ch)+1);
				}else {
					hm.put(ch, 1);
				}
			}
		}
		
		for(Map.Entry temp:hm.entrySet()) {
			
			System.out.println(temp.getKey() +" "+temp.getValue());
		}
		
	}
}