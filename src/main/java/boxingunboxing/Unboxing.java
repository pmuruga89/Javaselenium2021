package boxingunboxing;

public class Unboxing {

	public static void main(String[] args) {

		int i = 1000;
		
		//boxing
		Integer in = new Integer(i);
		System.out.println(in);
		
		//unboxing
		
		int a = in.intValue();
		System.out.println(a);
		
			
		String s = "50";
		
		int b = Integer.valueOf(s);
		System.out.println(b);
		
		int c = Integer.parseInt(s);
		System.out.println(c);
		
		
		String s1="121.01";
		
		double d = Double.valueOf(s1);
		System.out.println(d);
		
		s1 = Double.toString(d);
		System.out.println(s1);
		
		String m = String.valueOf(b);
		System.out.println(m);

		String j="murugan";
		String k="murugan";
		
		System.out.println(j.hashCode());
		System.out.println(k.hashCode());
		
		
	}

}
