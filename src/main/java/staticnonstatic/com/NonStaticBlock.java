package staticnonstatic.com;

public class NonStaticBlock {
	static int k=10;
	int ctr=0;
	
	public static void main(String[] args) {
		System.out.println("Main start");
		NonStaticBlock nb = new NonStaticBlock();
		NonStaticBlock nb1 = new NonStaticBlock();
		System.out.println(nb.ctr);
		System.out.println(nb1.ctr);
		System.out.println(k);
		System.out.println("Main End");
	}

	{
		System.out.println("IIB");
		k=30;
		ctr++;
	}
	
	static {
		System.out.println("Static Block");
	}
}
