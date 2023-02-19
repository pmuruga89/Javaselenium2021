package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		

		ArrayList<String>lst1 = new ArrayList<String>();
		ArrayList<String>lst2 = new ArrayList<String>();
		
		lst1.add("murugan");
		lst1.add("seetha");
		lst1.add("hari");
		
		lst2.add("jeeva");
		lst2.add("mathi");
		lst2.add("krishna");
		
		
		
		System.out.println(lst1.size());
		System.out.println(lst1.contains("murugan"));
		System.out.println(lst1.containsAll(lst2));
		lst1.addAll(lst2);
		System.out.println(lst1);
		lst1.removeAll(lst2);
		System.out.println(lst1);
		
		lst2.add("murugan");
		lst1.retainAll(lst2);
		System.out.println(lst1);
		
		System.out.println(lst1.addAll(lst2));
		System.out.println(lst2);
		System.out.println(lst2.indexOf("murugan"));
		System.out.println(lst2.lastIndexOf("murugan"));
		
		Iterator itr = lst2.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("murgan")) {
				System.out.println(itr.hasNext());
			}
		}
		System.out.println(lst2);
		System.out.println("----------");
		ListIterator itr1 = lst2.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("--------");
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		
		lst1.remove("murugan");
		System.out.println(lst1);
		
		lst1.clear();
		System.out.println(lst1);
		System.out.println(lst1.isEmpty());
		
		System.out.println(lst2);
		
		Object arr[]=lst2.toArray();
		System.out.println(arr.length);
		System.out.println(lst2.size());
		
		System.out.println(lst1);
		
		
		ArrayList<String>lst3= (ArrayList<String>)lst2.clone();
		System.out.println(lst3);
		System.out.println(lst3.hashCode());
		System.out.println(lst2.hashCode());
		System.out.println();
		
		
		ArrayList<String> nl = new ArrayList<String>();
		nl.add("murugan");
		nl.add(null);
		System.out.println(nl);
		System.out.println(nl.get(1));
		
		
		
	}
	

}
