package SuperKeywords;

class Vehical{
	String carColor = "blue";
	public static String owner = "murugan";
	
	Vehical(){
		System.out.println("Vehical constructor");
	}
	
	static void print() {
		System.out.println("Super class disp");
	}
	
	void print(String name) {
		System.out.println("Name: "+name);
	}
}

class Car extends Vehical{
	String maruti = "Red";
	
	Car(){
		super();//automaticall call the super class constructor here.
		System.out.println("Car constructor");
		
		
	}
	
	void disp() {//cannot use subclass method as static when we calling super keyword
		System.out.println(super.owner);
		super.print();
		super.print("murugan1");
		
	}
	
	
}
public class SuperKeyword {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.disp();

	}

}
