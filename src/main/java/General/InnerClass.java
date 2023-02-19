package General;

public class InnerClass {
	
	static class Inner1{
		
		void print1() {
			
		}
		
		static void print2() {
			
		}
		
	}
	
	class Inner2{
		void disp1() {
			
		}
		
//		static void disp2() {
//			
//		}//cannot declare static method in non static inner class.
		//Outter class accept both static and non static method.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
