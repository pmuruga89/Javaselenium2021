package LogicalProgram;

public class ReverseAWord {

	public static void main(String[] args) {

		String s = "Hello Murugan";
		
		String arr[] = s.split(" ");
		String s1 = "";
		
		for(int i=arr.length-1;i>=0;i--) {
			s1 = s1+ " "+arr[i];
		}
		System.out.println(s1.trim() );
	}

}
