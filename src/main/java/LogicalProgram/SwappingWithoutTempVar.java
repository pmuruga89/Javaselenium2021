package LogicalProgram;

public class SwappingWithoutTempVar {

	public static void main(String[] args) {

		String s1 = "30";
		String s2 = "50";
		
		s1 = Integer.toString(Integer.parseInt(s1)+Integer.parseInt(s2));
		s2 = Integer.toString(Integer.parseInt(s1)-Integer.parseInt(s2));
		s1 = Integer.toString(Integer.parseInt(s1)-Integer.parseInt(s2));
		
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
	}

}
