package General;

import java.io.IOException;

import org.omg.SendingContext.RunTime;

class ParrentClass{
	
	public void test(String a, int b) {
		System.out.println("I am test");
	}
	
	public static String test(String a, int b, String c) {
		System.out.println("I am static test");
		return "";
	}
}

public class OverRidding extends ParrentClass {
	public void test(String a, int b) {
		System.out.println("I am test");
	}

	public static String test(String a, int b, String c) {
		System.out.println("I am static test");
		return "";
	}

public static int k=30;
	public static void main(String[] args) throws IOException {
		int k;
		k=20;
		System.out.println(k);
		
		int a=100, b=30, c=0;
		
		String s = a>b?"Yes":"No";
		System.out.println(s);
	}

}
