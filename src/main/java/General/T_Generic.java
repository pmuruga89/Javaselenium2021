package General;

class Shape<T>{
	
	private T t;
	
	public void set(T t){
		this.t =t;
	}
	
	public T get() {
		return t;
	}
}


public class T_Generic {

	public static void main(String[] args) {

		Shape<String> s1 = new Shape();
		Shape<Integer>s2 = new Shape();
		
		s1.set("murugan");
		s2.set(100);
		
		System.out.println(s1.get());
		System.out.println(s2.get());
	}

}
