package SuperKeywords;

class A{
	
	static int ctr;
	static String name;
	int a=0;
	int b=0;
	
	A(){
		ctr++;
		
	}
	
	A(int a, int b){
		this.a = a;
		this.b=b;
	}
	
	void print() {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}

class B extends A{
	
	static int ctr;
	
	B(){
		//super(); //this will be called automatically by the compiler
		ctr++;
		name="murugan";
	}
	
	
	B(int a, int b){
		super(a,b);
	}
}


public class SuperMainMethod {

	public static void main(String[] args) {

		new A();
		new A();
		new A();
		
		A a1 =new A();
		
		System.out.println(a1.ctr);
		
		new B();
		new B();
		new B();
		
		B b1 = new B();
		System.out.println(b1.ctr);
		System.out.println(a1.ctr);
		
		System.out.println(a1.name);
		
		System.out.println("__________");
		
		
		b1.print();
		B b2 = new B(40,50);
		b2.print();
		
	}

}
