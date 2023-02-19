package LogicalProgram;

public class StringSplit {

	public static void main(String[] args) {

		String s1 = "murugan";
		
		String arr[] = s1.split("");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
		
		int x=-1,y=1, z;
		
		for(int i=0;i<10;i++) {
			
			
			z=x+y;
			x =y;
			y=z;
			System.out.println(x);
			
		}
	}

}
