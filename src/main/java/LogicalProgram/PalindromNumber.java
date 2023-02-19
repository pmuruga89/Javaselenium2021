package LogicalProgram;

public class PalindromNumber {

	public static void main(String[] args) {

		int a = 1221;
		
		int actual = a;
		
		int reverse =0;
		
		while(a>0) {
			
			int r = a%10;
			
			reverse = reverse *10 + r;
			
			a = a/10;
		}
		
		if(actual==reverse) {
			System.out.println("palindrom");
		}else {
			System.out.println("Not palindrom");
		}
	}
}
