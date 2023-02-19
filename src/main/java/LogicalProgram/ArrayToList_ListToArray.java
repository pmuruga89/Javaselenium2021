package LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList_ListToArray {

	public static void main(String[] args) {

		ArrayList<String> lst = new ArrayList<String>();
		lst.add("murugan");
		lst.add("hari");
		lst.add("jeeva");
		lst.add("seetha");
		
		System.out.println(lst);
		
		//Convert list to array
		Object s[] = (Object[])lst.toArray();
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		String st = s[0].toString();
		System.out.println(st);
		
		//Convert array to list
		
		List<Object> lst1 = Arrays.asList(s);
		System.out.println(lst1);
		
	}

}
