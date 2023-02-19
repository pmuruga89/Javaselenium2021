package constroctor.com;

public class Defaultconstructor {

	//default or no argument constructor

	String name;
	int age;
	
	Defaultconstructor(){
		name="murugan";
		age=32;
	}
	
	public static void main(String[] args) {

		Defaultconstructor d1 = new Defaultconstructor();
		System.out.println(d1.name);
		System.out.println(d1.age);
	}

}
