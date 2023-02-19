package updowncasting;


class Dog1{
	
	public void print() {
		System.out.println("I am print Dog1");
	}
	
	public void disp() {
		
		System.out.println("I am disp Dog1");
	}
}

class Dog2 extends Dog1{
	
	public void print() {
		System.out.println("I am print Dog2");
	}
	
	public void test1() {
		System.out.println("Test1");
	}
}


public class UpcastingTest{

	public static void main(String[] args) {

		  Dog1 d1= new Dog2();
		  
		  
		  
		  d1.print();
		  d1.disp();
		  
		  System.out.println("___________downcasting______");
		  
		  Dog2 d2 = (Dog2)d1;
		  d2.print();
		  d2.disp();
		  d2.test1();
		  
		  
		  
	}

}
