package staticnonstatic.com;

import java.awt.print.Printable;

class StaticMethod{
	
	public static void disp() {
		System.out.println("Static method class");
	}
	
}

class NonStaticMethod extends StaticMethod{
	public static int i=10;
	public int j=20;
	
	public void print() {
		System.out.println("Non static method class");
	}
	
}

public class StaticNonStaticMethod extends NonStaticMethod{

	public void snDisp() {
		System.out.println("snDisp");
		i=50;//static
		j=50;//non static
		disp();//static
		print();//non static
	}
	
	public static void snPrint() {
		System.out.println("snPrint");
		i=100;
		//j=100;
		
		disp();
		StaticNonStaticMethod sn = new StaticNonStaticMethod();
		sn.print();
		sn.j=100;
	}
	
	
	public static void main(String[] args) {

		StaticNonStaticMethod sn = new StaticNonStaticMethod();
		sn.snDisp();
		System.out.println(":::::::");
		sn.snPrint();
	}

}
