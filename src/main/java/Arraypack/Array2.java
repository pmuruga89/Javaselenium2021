package Arraypack;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		char ch[] = sc.nextLine().toCharArray();
		
		HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
		for(char c:ch) {
			
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
				
			}else {
				hm.put(c,1);
			}
		}
		
		for(Map.Entry tem:hm.entrySet()) {
			System.out.println(tem.getKey() +" "+tem.getValue());
		}
		
		System.out.println();
		
	}

}
