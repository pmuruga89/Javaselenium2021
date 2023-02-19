package LogicalProgram;

import org.bouncycastle.util.Arrays;

public class AddTwoDifferentSize_Array {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5};
		int b[] = {1, 2, 3};
		int c[];
		
		if(a.length>b.length) {
			c = Arrays.copyOf(a, a.length);
			
			for(int i=0;i<b.length;i++) {
				
				c[i] = c[i]+b[i];
			}
			
		}else if(a.length<b.length) {
			c = Arrays.copyOf(b, b.length);
			for(int i=0;i<a.length;i++) {
				
				c[i] = c[i]+a[i];
			}
		}else {
			c = Arrays.copyOf(a, a.length);
		}
		

		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
	}
	

}
