package LogicalProgram;

public class ArmStrongNumberGivenRange {

	public static void main(String[] args) {
		
		
		for(int i=1;i<1000;i++) {
			int temp,sum=0,r;
			temp = i;
			
			while(temp>0) {
				
				r = temp%10;
				sum = sum+r*r*r;
				temp = temp/10;
			}
			
			if(i==sum) {
				System.out.println("Armstrong: "+i);
			}
			
		}
	}

}
