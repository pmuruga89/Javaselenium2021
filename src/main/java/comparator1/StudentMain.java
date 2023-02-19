package comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentMain {

	public static void main(String[] args) {

		ArrayList<Student>lst = new ArrayList<Student>();
		lst.add(new Student(100, "murugan", 32));
		lst.add(new Student(99, "jeeva", 16));
		lst.add(new Student(120, "anil", 6));
		lst.add(new Student(190, "hari", 69));
		
		System.out.println("Before Sorting by Name");
		for (Student st : lst) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		} 	
		
		Comparator<Student>c = Comparator.comparing(Student::getName);
		Collections.sort(lst,c);
		
	   System.out.println("Sorting by Name");  
	   for(Student st: lst){  
	     System.out.println(st.rollno+" "+st.name+" "+st.age);  
	     }  
	}

}
