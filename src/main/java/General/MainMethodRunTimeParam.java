package General;

public class MainMethodRunTimeParam {

	public static void main(String[] args) {

		System.out.println(args[0]);
		//System.out.println(args[1]);
		
		
		System.setProperty("murugan", "seetha");
		
		//System.out.println(System.getProperty("murugan"));
		
		System.out.println(System.getenv());
		
	}

}
