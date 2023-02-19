package Exception1;

public class TryCatchFinallyExecutionHierachy {

	public static void main(String[] args) {

		
		try {
			System.out.println("I am try");
			int i=10;
			int k = i/0;
		}catch(Exception e) {
			System.out.println("I am catch");
		}finally {
			System.out.println("I am finally");
		}
	}

}
