package LogicalProgram;

public class UppercaseCamalCase1 {

	public static void main(String[] args) {

		String s1 = "muRUgan";
		
		StringBuffer sb = new StringBuffer();

		sb.append(s1);
		sb.deleteCharAt(0);
		
		s1 = String.valueOf(s1.toUpperCase().charAt(0)) + sb.toString().toLowerCase();
		System.out.println(s1);

	}

}
