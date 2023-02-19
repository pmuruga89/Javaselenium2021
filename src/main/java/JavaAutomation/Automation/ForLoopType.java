package JavaAutomation.Automation;

public class ForLoopType {

	public static void main(String[] args) {

		for(int i=0;i<10;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int j=0;j<10;) {
			System.out.print(j + " ");
			j++;
		}
		
		System.out.println();
		
		for(int k=0;;k++) {
			System.out.print(k+" ");
			
			if(k==100) {
				break;
			}
		}
		
		System.out.println();
		
		for(int a=0,b=0; a<10&&b<10; a++, b++) {
			System.out.println(a);
			System.out.println(b);
		}
	}

}

