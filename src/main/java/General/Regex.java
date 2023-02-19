package General;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		String s1="www.murugan.com1 is one of the com site";
		
		String s2 = Pattern.compile("[com]").matcher(s1).replaceAll("");
		System.out.println(s2);
		
		boolean b = Pattern.compile("\\D*").matcher(s1).matches();
		System.out.println(b);

	}

}
