package General;


abstract class Abs{
	
	public abstract void print();
}

public class AnnonymousClass {

	public static void main(String[] args) {

		Abs ab = new Abs() {
			
			public void print() {
				System.out.println("I am implemented in inner class");
			}
		};
		
		ab.print();
	}

	
}
