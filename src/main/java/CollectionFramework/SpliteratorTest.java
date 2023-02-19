package CollectionFramework;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorTest {

	public static void main(String[] args) {

		ArrayList<Integer>lst = new ArrayList<Integer>();
		
		lst.add(100);
		lst.add(200);
		lst.add(300);
		//lst.add(400);
		
		Stream<Integer> st = lst.stream();
		Spliterator<Integer> split = st.spliterator();
		
		System.out.println(split.getExactSizeIfKnown());
		System.out.println(split.estimateSize());
		
		split.forEachRemaining((n)->System.out.println(n));
		
		System.out.println("**************");
		//splitting the list
		Stream<Integer> st1 = lst.stream();
		Spliterator<Integer> split1 = st1.spliterator();
		
		//split1.forEachRemaining((n)->System.out.println(n));
		
		Spliterator<Integer> sp1 = split1.trySplit();
		Spliterator<Integer> sp2 = split1.trySplit();
		System.out.println("Splitting the equalent value");
		System.out.println(sp1);
		System.out.println("_______");
		
       if(sp1 != null) {  
    	   sp1.forEachRemaining((n) -> System.out.println(n));  
        }
       
       System.out.println("__________");
       
       sp2.forEachRemaining((n)->System.out.println(n));
	
	}

}
