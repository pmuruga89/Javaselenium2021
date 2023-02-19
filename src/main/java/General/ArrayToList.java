package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {

		ArrayList<String> lst = new ArrayList<String>();
		lst.add("hari");
		lst.add("murugan");
		lst.add("seetha");
		
		Object []obj= (Object[])lst.toArray();
		System.out.println(obj[0].toString());
		
		List<Object> lst1 =  Arrays.asList(obj);
		System.out.println(lst1);
		
		String arr[] = {"muru", "hari", "seetha"};
		List<String> li2 = Arrays.asList(arr);
		System.out.println(li2);
		
	}

}
