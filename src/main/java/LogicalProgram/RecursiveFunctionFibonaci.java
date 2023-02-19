package LogicalProgram;



public class RecursiveFunctionFibonaci{
	
	static int x=-1, y=1, z=0;
	
	public static void fibonaci(int n) {
		
		if(n>0) {
			
			z = x+y;
			System.out.println(z);
			x=y;
			y=z;
			
			fibonaci(n-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		RecursiveFunctionFibonaci.fibonaci(10);
		
		Character.toChars('1');
;
	}

}
