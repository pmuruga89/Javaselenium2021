package StringStBuffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClass {

	public static void main(String[] args) {

		//1st way
		Pattern p = Pattern.compile("\\D*");
		Matcher m = p.matcher("murugan");
		System.out.println(m.matches());
		
		//2nd way
		boolean b2 = Pattern.compile("\\D*").matcher("murugan").matches();
		System.out.println(b2);
		
		//3rd way
		System.out.println(Pattern.matches("\\D*", "muru 1gan"));

		//Get only char
		String s1="murgan123*&^";
		String s = Pattern.compile("[^a-zA-Z0-9]").matcher(s1).replaceAll("");
		System.out.println(s);
		
		System.out.println(s1.replaceAll("[^a-zA-Z]", ""));
		
		
		String i="I am murugan";
		
		i = i.replace(" " , "").toLowerCase();
		String j="abcdefghijklmnopqrstuvwxyz";
		
		
		System.out.println(i);
		String k = Pattern.compile("["+i+"]").matcher(j).replaceAll("");
		System.out.println(k);
		
		
		String a="I am murugan, having super fast car. That car is very slow";
		
		
	}

}
