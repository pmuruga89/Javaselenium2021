package AbstractInterface;

public abstract interface InterfaceMain {

	default void test1() {
		
		System.out.println("Interface - test1");
	}
	
	public default void test2() {
		System.out.println("Interface - test2");
	}
	
	public static void test3() {
		System.out.println("Interface - test3");
	}
	
	public abstract void test4();
	
	public static final int a=10;
	
}
