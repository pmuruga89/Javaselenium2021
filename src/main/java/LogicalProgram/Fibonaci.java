package LogicalProgram;

public class Fibonaci {

	public static void main(String[] args) {

		int x=-1,y=1,z=0;
		
		for(int i=0;i<10;i++) {
			
			z = x+y;
			System.out.println(z);
			
			x=y;
			y=z;
			
		}
	}

}
