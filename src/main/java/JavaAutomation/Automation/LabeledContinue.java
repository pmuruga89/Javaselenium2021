package JavaAutomation.Automation;

public class LabeledContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aa:
		for(int i=0;i<10;i++) {
			bb:
			for(int j=0;j<10;j++) {
				
				if(j==3) {
					continue aa;
				}
				
				System.out.println(j);
			}
		}
	}

}
