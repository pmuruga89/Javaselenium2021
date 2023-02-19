package CollectionFramework;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class CollectionClass extends AbstractList{

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<Integer>();
		
		lst.add(50);
		lst.add(34);
		lst.add(90);
		lst.add(23);
		
		lst.get(0);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(1);
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(5);
		
		//sort
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
		
		//min
		System.out.println(Collections.min(lst));
		
		//max
		System.out.println(Collections.max(lst));
		
		//reverse
		Collections.reverse(lst);
		System.out.println(lst);
		
		//suffle
		Collections.shuffle(lst);
		System.out.println(lst);
		
		//disjoint
		System.out.println(Collections.disjoint(lst,lst1));
		
		System.out.println(lst);
		System.out.println(Collections.binarySearch(lst,90));
		
		//copy
		System.out.println("_________");
		System.out.println(lst);
		System.out.println(lst1);
		Collections.copy(lst1,lst);
		System.out.println(lst1);
		
		
	}

	@Override
	public Object get(int index) {
		System.out.println("Hi i am implemented");
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
