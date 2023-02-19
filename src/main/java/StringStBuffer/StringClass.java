package StringStBuffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringClass {

	public static void main(String[] args) {

		String s1="murugan";
		String s2 = new String("murugan");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s2);
		
		String s3="murugan";
		String s4="muruganmurugan";
	
		
		String s5=s1+s3;
		
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		
		String s6 = "murugan" + "murugan";
		System.out.println(s4==s6);
		System.out.println(s4.equals(s6));
		
		System.out.println(s3.equals(new String("murugan")));
		
	}

}
