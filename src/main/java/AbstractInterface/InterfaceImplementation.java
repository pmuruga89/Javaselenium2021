package AbstractInterface;

public class InterfaceImplementation implements InterfaceMain{

	public void test4() {
		System.out.println("Implemented interface method");
	}
	
	public static void main(String[] args) {
		
		InterfaceImplementation im = new InterfaceImplementation();
		im.test1();
		im.test2();
		im.test4();
		
		InterfaceMain im1 = new InterfaceImplementation();
		
		im1.test1();
		im1.test2();
		im1.test4();
		//InterfaceImplementation.test3(); cannot
		
		InterfaceMain.test3();
		
		int x = InterfaceImplementation.a;
		System.out.println(x);
	}

}
