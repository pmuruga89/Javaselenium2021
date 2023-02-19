package General;

class StaticMethod{
	
	public static void test() {
		System.out.println("Super class");
	}
	
	public static String test(String n) {
		System.out.println("Super class");
		return "";
	}
}

public class StaticNonStaticMethod extends StaticMethod{
	
	public static void test() {
		System.out.println("Subclass");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
