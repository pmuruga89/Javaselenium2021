package updowncasting;

class Superclass{
	public void disp() {
		System.out.println("Superclass");
	}
	
	static void print() {
		System.out.println("I am print");
	}
}

public class Subclass extends Superclass{

	public void test() {
		System.out.println("Subclass");
	}
	
	public static void main(String args[]) {
		
		Superclass u1 = new Subclass();
		
		//u1.test();//cannot access own memeber
		u1.disp();
		
		//downcasting
		
		Subclass s1 = (Subclass)u1;
		
		s1.disp();
		s1.test();
		
		
		
		Subclass.print();
		Superclass.print();
		
		//class cast exception
		//Superclass su = new Superclass();
		//Subclass s2 = (Subclass)su;
		
	}
}
