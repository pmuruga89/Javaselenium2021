package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {

		HashSet<String>hs = new HashSet<String>();
		hs.add("murugan");
		hs.add("anil");
		hs.add("jeeva");
		hs.add("seetha");
		hs.add("murugan");
		System.out.println(hs);
		
		ArrayList<String>lst1 = new ArrayList<String>();
		lst1.add("murugan1");
		lst1.add("seetha1");
		lst1.add("hari1");
		lst1.add("seetha1");
		lst1.add("");
		lst1.add(null);
		lst1.add(null);
		
		hs.addAll(lst1);
		System.out.println(hs);
		
		
	}

}
