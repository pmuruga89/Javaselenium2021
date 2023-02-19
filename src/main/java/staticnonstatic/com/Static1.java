package staticnonstatic.com;

class Static2{
	
	static {
		System.out.println("Static2 SIB");
	}
	
	{
		System.out.println("Static2 IIB");
	}
}
public class Static1 {

	static {
		System.out.println("Static1 SIB");
	}
	public static void main(String[] args) {

		System.out.println("Main start");
		Static2 s2 = new Static2();
		Static1 s1 = new Static1();
		System.out.println("Main end");
	}

	{
		System.out.println("Static1 IIB");
	}
}
