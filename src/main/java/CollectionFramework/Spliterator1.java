package CollectionFramework;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Spliterator1 {

	public static void main(String[] args) {

		ArrayList<String>lst1 = new ArrayList<String>();
		lst1.add("murugan");
		lst1.add("seetha");
		lst1.add("hari");
		lst1.add("jeeva");
		lst1.add("mathi");
		lst1.add("krishna");
		
		System.out.println("List");
		System.out.println(lst1);
		
		Stream<String>st = lst1.stream();
		Spliterator<String>spt = st.spliterator();
		
		//spt.forEachRemaining((n)->System.out.println(n)); or
		
		//splitting the value into two
		
		Spliterator<String> s1 = spt.trySplit();
		Spliterator<String> s2 = spt.trySplit();
		
		s1.forEachRemaining((n)->System.out.println(n));
		System.out.println("________");
		s2.forEachRemaining((n)->System.out.println(n));
		
		
	}

}
