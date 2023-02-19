package StringStBuffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplaceAll {

	public static void main(String args[]) {
		
		String s1="murug an123*&^";
		
		//get only char
		System.out.println(s1.replaceAll("[^A-Za-z]", ""));
		
		//get only char and number
		System.out.println(s1.replaceAll("[^A-Za-z0-9]", ""));
	
		//get only special char
		String s2 = s1.replaceAll("[A-Za-z0-9]", "");
		System.out.println(s2);
		
	
		//get only number
		System.out.println(s1.replaceAll("[^0-9]", ""));
		
		
		//Mobile number validatin
		System.out.println(Pattern.matches("[0-9]{10}", "1234567890"));
		
	}
}
