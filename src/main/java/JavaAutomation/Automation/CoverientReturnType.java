package JavaAutomation.Automation;


class Fruit{
	
	Fruit getFruit() {
	
		return new Fruit();
	}
	
	void print() {
		System.out.println("Fruit class");
	}
}

class Apple extends Fruit{
	
	Apple getFruit() {
		
		return new Apple();
	}
	
	void disp() {
		System.out.println("Apple class");
	}
}


public class CoverientReturnType {

	public static void main(String[] args) {
		
		Fruit f = new Fruit();
		Fruit f1 = f.getFruit();
		f1.print();
		
		Apple a = new Apple();
		 a.getFruit().print();
		
		
		
		
	}

}
