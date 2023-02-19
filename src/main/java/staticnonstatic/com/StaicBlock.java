package staticnonstatic.com;

public class StaicBlock {
	
	public static void main(String[] args) {

		System.out.println(i);
	}
	
	static {
		i=20;
	}
	
	static int i=50;
}
