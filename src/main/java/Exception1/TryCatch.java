package Exception1;

public class TryCatch {

	public static void main(String[] args) {

		int i=10;
		int j;
		try {
			System.out.println("Excuting try block");
			//j=i/0;
			
			int a = Integer.parseInt("ssdf");
			
			String s ="murugan";
			//s.charAt(10);
			
			System.out.println("Execution completed");
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("ArithMatic: "+e.getMessage());
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Number: "+e.getMessage());
		}
	}

}
