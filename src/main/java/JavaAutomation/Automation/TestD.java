package JavaAutomation.Automation;

class TN{
	
	public int a=10;
	public static int b=20;
	
	
	public void print() {
		System.out.println("non static print");
	}
	
	public static void disp() {
		System.out.println(" static disp");
	}
	
	TN(){
		System.out.println("TN constrictor");
	}
}

public class TestD extends TN{
	
	TestD(String s){
		this();
		System.out.println("subclass constroctor");
		this.test1();
		
	}
	
	TestD(){
		super();
		System.out.println("subclass constroctor");
		this.test1();
	}
	
	

	public static void main(String[] args) {
		
		TestD t = new TestD();
		t.test1();
	}
	
	public void test1() {
		super.print();
		super.disp();
		this.test1();
		this.test2();
	}
	
	public static void test2() {
		
	}
}
