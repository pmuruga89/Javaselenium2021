package General;

class A1 {

	public void print() {
		System.out.println("I am print method of A1");
	}

}

class B1 extends A1{

	public void print() {
		System.out.println("I am print method of B1");
	}
}

public class ObjectRefferenceTest {

	public static void main(String[] args) {

		A1 a1 = new A1();
		B1 b1 = new B1();

		System.out.println(a1.hashCode());
		System.out.println(b1.hashCode());

		a1=b1;

		System.out.println(a1.hashCode());
		System.out.println(b1.hashCode());
		
		if (a1 == b1) {
			System.out.println("Both equal");
		} else {
			System.out.println("Both not equal");
		}

		a1.print();
	}

}
