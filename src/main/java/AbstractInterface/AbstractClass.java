package AbstractInterface;

abstract class Abstract1{
	
	void test1() {
		System.out.println("I am test method");
	}
	static void test2() {
		System.out.println("I am static method");
	}
	
	 abstract void disp();
}


public class AbstractClass extends Abstract1{

	public void disp() {
		System.out.println("I implemented in child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractClass.test2();
		
		AbstractClass ab = new AbstractClass();
		ab.disp();
		
		//Abstract1 a = new Abstract1();//cannot create object for abstract class
		
	}

}
