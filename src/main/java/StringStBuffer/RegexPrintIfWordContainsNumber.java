package StringStBuffer;

import java.util.regex.Pattern;

public class RegexPrintIfWordContainsNumber {

	public static void main(String[] args) {
		
		String s1="I am1 murugan";
		
		StringBuffer matching = new StringBuffer();
		StringBuffer notmatching = new StringBuffer();
		
		String arr[] = s1.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
			if(Pattern.matches("\\D*", arr[i])) {
				matching.append(arr[i]);
			}else {
				notmatching.append(arr[i]);
			}
		}
		
		System.out.println("Matching: "+matching);
		System.out.println();
		System.out.println("Not matching:"+notmatching);

	}

}
