package JavaAutomation.Automation;

public class ORDoubleOR {

	public static int add(int a, int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {

		int a=10,b=20,c=30,d=40;

		if((a>b)||(c>d)) {
			System.out.println("Single | pass");
		}else {
			System.out.println("Single | fail");
		}
		
		int i=0,j=0;
		
		j=++i;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(add(add(100, 200),add(100, 200)));
	}

}
