package LogicalProgram;

public class PerfectNumber {

	public static void main(String[] args) {

		int sum=0, x=0;
		for(int i=1;i<100;i++) {
			
			for(int j=1;j<i;j++) {
				
				x = i%j;
				if(x==0) {
					sum=sum+j;
				}
			}
			
			if(sum == i) {
				System.out.println(i);
				for(int j=1;j<i;j++) {
					
					x = i%j;
					if(x==0) {
						System.out.println(j);
					}
				}
			}
			
			sum=0;
		}
		
	}

}
