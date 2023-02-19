package Exception1;

public class NestedTryCatch {

	public static void main(String[] args) {

		int i = 10;
		int j;

		try {

			try {

				try {
					System.out.println("Execution started");
					j = i / 0;
					//int a = Integer.parseInt("asdf");
					
					//String s1 = null;
					//System.out.println(s1.hashCode());
					
					System.out.println("Execution ended");

				} catch (NumberFormatException e) {

					e.printStackTrace();
				}

			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException --Handled inner");
				e.printStackTrace();
			}

		} catch (Exception e) {
			
			System.out.println("Handled outer catch");
			e.printStackTrace();
		}
	}

}
