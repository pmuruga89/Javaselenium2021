package LogicalProgram;

public class ImmutableDemo {
	
	public Object[] set(String s) {
		String arr[] = new String[2];
		
		return arr;
	}

	public static void main(String[] args) {

		  
		Employee e = new Employee("ABC123"); 
		e = new Employee("ABC1234545454"); 
		String s1 = e.getPancardNumber();  
		System.out.println("Pancard Number: " + s1);  
		
		e=null;
		
		System.out.println(e.getPancardNumber());
	}

}
