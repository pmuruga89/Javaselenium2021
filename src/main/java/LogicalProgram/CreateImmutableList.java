package LogicalProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateImmutableList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Atto");
		list.add("Rick");
		list.add("Shalini");
		List<String> immuList = Collections.unmodifiableList(list);
		
		immuList.add("asfd");
		System.out.println(immuList);
		
	}

}
