package comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FamiilyAgeNameSortingMain {

	public static void main(String[] args) {

		ArrayList<FamilyAgeName> lst = new ArrayList<FamilyAgeName>();
		
		lst.add(new FamilyAgeName("murugan", 32));
		lst.add(new FamilyAgeName("jeeva", 14));
		lst.add(new FamilyAgeName("thulasi", 50));
		lst.add(new FamilyAgeName("ponnusamy", 55));
		lst.add(new FamilyAgeName("hari", 2));
		lst.add(new FamilyAgeName("seetha", 25));
		
		Comparator<FamilyAgeName> cp = Comparator.comparing(FamilyAgeName::getAge);
		
		Collections.sort(lst, cp);
		
		for(FamilyAgeName t :lst) {
			System.out.println(t.getName() +" " +t.age);
		}
	}

}
