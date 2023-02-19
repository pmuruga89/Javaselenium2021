package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		TreeSet<String>ts = new TreeSet<String>();
		
		ts.add("murugan");
		ts.add("seetha");
		ts.add("hari");
		ts.add("murugan");
		ts.add("anil");
		//ts.add(null);cannot
		System.out.println(ts);
		
		System.out.println(ts.contains("murugan"));
		System.out.println(ts.containsAll(ts));
		
		ArrayList<String>lst1 = new ArrayList<String>();
		lst1.add("murugan1");
		lst1.add("seetha1");
		lst1.add("hari1");
		System.out.println(ts.addAll(lst1));
		System.out.println(ts);
		
		System.out.println("************Iterator**********");
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("*********decendingIterator******");
		
		Iterator<String>ds = ts.descendingIterator();
		while(ds.hasNext()) {
			System.out.println(ds.next());
		}
		
	}

}
