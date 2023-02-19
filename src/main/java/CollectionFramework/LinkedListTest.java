package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList lst = new LinkedList<String>();
		
		lst.offer("murugan");
		lst.add("jeeva");
		lst.addFirst("mathi");
		System.out.println(lst);
		lst.poll();
		System.out.println(lst);
		
		
		System.out.println(lst);
		
	}

}
