package General;

abstract class Abstract1{
	
	abstract void test1();
	abstract void test2();
	
	public static void disp() {
		System.out.println("I am disp");
	}
}

 abstract class Abstract2 extends Abstract1{
	
	void test1() {
		System.out.println("Implemented in sub class");
	}
		
}

 public class AbstractClass extends Abstract2{

	 public void test2() {
		 System.out.println("implemented in sub class");
	 }
	
	public static void main(String[] args) {

		AbstractClass ac = new AbstractClass();
		ac.test1();
		ac.test2();
		
		ac.disp();
		
	}

}
