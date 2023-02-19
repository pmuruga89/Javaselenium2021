package AbstractInterface;


public class TestInheritance extends BaseAbstract{
	
	public static void disp() {
		System.out.println("I am BaseClass");
	}
	
	public void print() {
		System.out.println("Print method is implemented in subclass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInheritance.disp();
	}

}
