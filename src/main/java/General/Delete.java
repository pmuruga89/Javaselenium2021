package General;

class AA1{
	void test1() {
		
	}
	
	void test2() {
		
	}
}

class BB1 extends AA1{
	void test1() {
		
	}
}

class CC1 extends BB1{
	void test1() {
		
	}
	
}

public class Delete extends CC1{
		
		
	public static void main(String args[]) {
		
		BB1 b1 = new CC1();
		b1.test1();
		b1.test2();
		
		BB1 b = (BB1)b1;
	}
}
