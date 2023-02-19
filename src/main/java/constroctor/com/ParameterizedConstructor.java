package constroctor.com;

public class ParameterizedConstructor {

	static int age;
	static String name;
	
	ParameterizedConstructor(int age){
		this.age = age;
		
	}
	ParameterizedConstructor(int age, String name){
		this.age =age;
		this.name = name;
	}
	
	public static void main(String[] args) {

		System.out.println(ParameterizedConstructor.age);
		
		ParameterizedConstructor pc1 = new ParameterizedConstructor(32);
		System.out.println(pc1.age + " " +pc1.name);
		
		ParameterizedConstructor pc2 = new ParameterizedConstructor(33, "murugan");
		System.out.println(pc2.age +"  "+ pc2.name);
	}

}
