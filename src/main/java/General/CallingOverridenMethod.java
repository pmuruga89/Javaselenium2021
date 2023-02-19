package General;

class A{
	
	public void test() {
		System.out.println("Test imemented in class A");
	}
	
	public static void print() {
		System.out.println("Print implemented in class A");
	}
}

class B extends A{
	
	public void test() {
		System.out.println("Test imemented in class B");
	}
	
	public static void print() {
		System.out.println("Print implemented in class B");
	}
}

public class CallingOverridenMethod {

	public static void main(String[] args) {
		
		A a1 = new B();
		
		a1.test();
		
		A.print();
	
		
	}

}
