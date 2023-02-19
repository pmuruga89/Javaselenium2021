package LogicalProgram;

public class SwappingStringWithoutTemp {

	public static void main(String[] args) {
		
		String s1 = "murugan";
		String s2 = "seetha";
		
		s1 = s1+"#"+s2;
		
		s2 = s1.split("#")[0];
		s1 = s1.split("#")[1];
		
		System.out.println(s1);
		System.out.println(s2);
				
		
	}

}
