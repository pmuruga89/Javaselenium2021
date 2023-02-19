package LogicalProgram;

import java.util.ArrayList;

public class RemoveAllWhiteSpace {

	public static void main(String[] args) {

		//Remove all while space
		String s = "I   am           murugan";
		System.out.println(s.replaceAll("\\s", ""));
		
		
		
		//Remove all white space and provide single while space.
		String arr[] = s.split(" ");
		ArrayList<String>lst = new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			
			if(!arr[i].isEmpty()) {
				System.out.println(arr[i]);
				lst.add(arr[i]);
			}
		}
		System.out.println("convert list to array");
		Object arr1[] = (Object[])lst.toArray();
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
