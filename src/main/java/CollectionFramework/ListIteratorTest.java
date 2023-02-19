package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.stream.Stream;


public class ListIteratorTest {

	public static void main(String[] args) {

		LinkedList<String> lt = new LinkedList<String>();
		
		lt.add("murugan");
		lt.add("jeeva");
		lt.add("hari");
		lt.add("mathi");
		
		Iterator itr = lt.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("::::::::::List Iterator::::::::::");
		
		
		ListIterator itr1 = lt.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("::::::::::Previous::::::::::");
		
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		
		
		System.out.println("___________________Spliterator_______");
		
		Stream<String>st = lt.stream();
		
		Spliterator<String> sp = st.spliterator();
		Spliterator<String> sp1 = sp.trySplit();
		Spliterator<String> sp12 = sp.trySplit();
		
		if(sp1!=null) {
			sp1.forEachRemaining((n)->System.out.println(n));
		}
		System.out.println("____");
		if(sp12!=null) {
			sp12.forEachRemaining((n)->System.out.println(n));
		}
	}

}
