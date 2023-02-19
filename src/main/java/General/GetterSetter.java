package General;

class GetSet{
	private String name;
	private int sal;


	public void setName(String name) {
		this.name = name;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		
		return name;
	}

	public int getSal() {
		return sal;
	}
}

public class GetterSetter {

	public static void main(String args[]) {
		
		GetSet g = new GetSet();
		g.setName("Murugan");
		System.out.println(g.getName());
		
		g.setSal(1000);
		System.out.println(g.getSal());
	}

}
