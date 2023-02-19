package General;

public class ThisKeyword {

	public static int a;
	public int b=0;
	
	public int add(int a, int b) {
		
		this.a=a;
		this.b=b;
		this.m1();
		return a+b;
	}
	
	public static void main(String args[]) {
		
		ThisKeyword k = new ThisKeyword();
		
		int j = k.add(10, 20);
		
		System.out.println(k.b);
		System.out.println(ThisKeyword.a);
		
		System.out.println(j);
		
		
	}
	
	public void m1() {
		
	}
	
}
