package JavaAutomation.Automation;

strictfp public class LabeledBreak {

	public static void main(String[] args) {
		
		
		aa:
		for(int i=0;i<10;i++) {
			bb:
			for(int j=0;i<10;j++) {
				
				if(j==3) {
					break bb;
				}
				System.out.println(j);
			}
		}
		System.out.println("loop breaked");
	}

}
