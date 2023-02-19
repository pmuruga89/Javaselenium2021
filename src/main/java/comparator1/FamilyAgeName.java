package comparator1;

public class FamilyAgeName {

	String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	FamilyAgeName(String name, int age){
		this.name=name;
		this.age=age;
	}
	
}
