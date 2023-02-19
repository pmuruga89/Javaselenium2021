package JavaAutomation.Automation;

class Dim{
	
}

public class InstanceOfKeyword extends Dim{

	public static void main(String[] args) {

		InstanceOfKeyword ins = new InstanceOfKeyword();
		
		//Dim d = new Dim();
		
		if(ins instanceof InstanceOfKeyword) {
			System.out.println("Yes");
		}
		
		if(ins instanceof Dim) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}
