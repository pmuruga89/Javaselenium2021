package General;

public class ClassCanBeStatic {

	public static int a=10;
	 int b=20;
	
	public static class A{
		
		public void test1() {
			System.out.println("I am inner class non static method");
		}
		
		public static void test2() {
			System.out.println("I am Inner class static method");
		}
		
	}
	
	public class B{
		
		public void test3() {
			System.out.println("Test3");
			
			ClassCanBeStatic c = new ClassCanBeStatic();
			System.out.println(c.a);
			System.out.println(c.b);
			
		}
		
//		public static void test4() {
//			System.out.println("Test4");
//		}
	}
	
	public static void main(String[] args) {

		ClassCanBeStatic.A.test2();
		
		ClassCanBeStatic sc = new ClassCanBeStatic();
		
		ClassCanBeStatic.B b1 = sc.new B();
		b1.test3();
		
		ClassCanBeStatic.A a1 = new A();
		
		a1.test1();
		
	}

}
