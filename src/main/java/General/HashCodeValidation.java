package General;

public class HashCodeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="murugan";
		String s2="Hari";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1==s2) {
			System.out.println("s1 and s2 equal");
		}else {
			System.out.println("s1 and s2 are not equalssf");
		}
		
		
		s1=s2;
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1==s2) {
			System.out.println("s1 and s2 equal");
		}
		
	}

}
