package LogicalProgram;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindVowelsAndOccurenceofVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		LinkedHashMap<Character, Integer>hm = new LinkedHashMap<Character, Integer>();
		
		char c ='\u0000';
		
		for(int i=0;i<s.length();i++) {
			
			c = s.charAt(i);
			
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		String vow = "aeiou";
		for(Entry<Character, Integer>temp:hm.entrySet()) {
			
			if(vow.toLowerCase().contains(String.valueOf(Character.toLowerCase(temp.getKey())))) {
				System.out.println(temp.getKey() + " "+temp.getValue());
			}
		}
	}

}
