package General;

abstract interface In{

	public default void test1() {
		System.out.println("default method");
	}
	
	public static void test2() {
		System.out.println("static method");
	}
	
	default void test3() {
		System.out.println("default 2");
	}
	
	public abstract void test4();
	
}

public class NewInter implements In{

	public void test4() {
		System.out.println("Implemented in child");
	}
	public static void main(String[] args) {
		
		NewInter n = new NewInter();
		n.test1();
		n.test3();
		n.test4();
		In.test2();
	}

}
