package StringStBuffer;

import java.util.ArrayList;

public class StringBuilderClass {

public static void main(String args[]) {
	
	StringBuilder sb = new StringBuilder("sadf");
	sb.append("murugan");
	
	String s1="murugan";
	String s2="murugan";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1==s2);
	
	String s3 = new String("murugan");
	System.out.println(s3==s1);
	s1=s3;
	System.out.println(s1==s3);
	
	StringBuilderClass sb1 = new StringBuilderClass();
	StringBuilderClass sb2= new StringBuilderClass();
	
	System.out.println(sb1.hashCode());
	System.out.println(sb2.hashCode());
	
	System.out.println(sb1==sb2);
	sb1=sb2;
	System.out.println(sb1==sb2);
		
}
	
}
