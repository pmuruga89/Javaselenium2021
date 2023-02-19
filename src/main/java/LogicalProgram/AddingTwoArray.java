package LogicalProgram;

import org.bouncycastle.util.Arrays;

public class AddingTwoArray {

	public static void main(String[] args) {

		int a[] = {2, 3, 6, 2};
		int b[] = {5, 2, 4, 3};
		
		for(int i=0;i<a.length;i++) {
			
				b[i]=a[i]+b[i];
		}
		
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");
		}
		
		System.out.println();
		
		int c[] = Arrays.copyOf(b, b.length);
		for(int k=0;k<c.length;k++) {
			System.out.print(c[k]+" ");
		}
	}

}
