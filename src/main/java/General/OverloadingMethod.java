package General;

class Animal{
	
	public void print() {
		System.out.println("I am animal class");
	}
	
	public void print(int a, int b) {
		System.out.println("I am print method 2");
	}
	
	public int print(int a, double t) {
		System.out.println("I am print method 3");
		return 10;
	}
}




public class OverloadingMethod extends Animal{

	public void print() {
		System.out.println("I overridddeeen print method");
	}
	
	public static void main(String[] args) {

		Animal al = new Animal();
		al.print();
		al.print(10, 10);
		al.print(10,  10l);
		
		System.out.println("___________");
		
		OverloadingMethod ol = new OverloadingMethod();
		ol.print();
		ol.print(10, 20l);
	}

}
