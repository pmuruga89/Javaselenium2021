package boxingunboxing;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer in = new Integer(100);
		
		System.out.println(in);
		
		Long l = new Long(2);
		System.out.println(l);
		
		Double d = new Double(23);
		System.out.println(d);
		
		
		Boxing b = new Boxing();
		System.out.println(b);
		
	}
	
	int i=500;
	
	 public String toString() {
		 return Integer.toString(i);
	 }

}
