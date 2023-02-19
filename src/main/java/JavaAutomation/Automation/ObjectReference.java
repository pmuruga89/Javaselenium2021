package JavaAutomation.Automation;


public class ObjectReference extends Dim{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectReference o1 = new ObjectReference();
		ObjectReference o2 = new ObjectReference();
		
		//Now both object will be having different reference
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.equals(o2));
		
		o1=o2;
		System.out.println("---");
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.equals(o2));

	}

}
