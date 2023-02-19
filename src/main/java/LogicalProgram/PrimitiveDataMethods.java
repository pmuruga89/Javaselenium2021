package LogicalProgram;

public class PrimitiveDataMethods {

	public static void fl(float f) {
		System.out.println("Float: "+f);
	}
	
	public static void fl(double d) {
		System.out.println("Double: "+d);
	}
	
	public static void fl(int i) {
		System.out.println("Int: "+i);
	}
	
	public static void fl(long l) {
		System.out.println("Long: "+l);
	}
	
	public static void main(String[] args) {

		PrimitiveDataMethods.fl(2l);
	}

}
