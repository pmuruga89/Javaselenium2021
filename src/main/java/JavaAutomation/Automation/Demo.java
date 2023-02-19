package JavaAutomation.Automation;

public class Demo {

	public static byte b;
	public static short s;
	public static int i;
	public static long l;
	public static double d;
	public static float f;
	public static char c;
	public static String s1;
	
	
	public static void main(String args[]) {

		System.out.println("byte: "+b);
		System.out.println("short: "+s);
		System.out.println("int: "+i);
		System.out.println("long: "+l);
		System.out.println("float: "+f);
		System.out.println("double: "+d);
		System.out.println("char: "+c);
		System.out.println("boolean: "+b);
		System.out.println("String: "+s1);
		
		float f1=10.19f;
		System.out.println(f1);
		
		double d1=12.1219d;
		System.out.println(d1);
		
		char c1='\u0000';
		System.out.println(c1);
		System.out.println("sfd");
		String s2="";
		System.out.println(s2);
		String s3=null;
		
		System.out.println(s3);
		
		int x=100, y=20, z=0,k=0,j=500;
		
		k=x>y?z:j;
		
		System.out.println(k);
	}
	

}
