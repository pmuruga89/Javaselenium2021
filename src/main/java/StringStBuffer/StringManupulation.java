package StringStBuffer;

public class StringManupulation {

	public static void main(String[] args) {
		
		String s1 = "Murugan is good friend";
		
		//length()
		System.out.println(s1.length());
		//s1.toCharArray()
		char ch[] = s1.toCharArray();
		for(char temp:ch) {
			System.out.print(temp+" ");
		}
		
		System.out.println();
		//s1.chartAt(0)
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println("::::");
		//concat
		String s2 = "Hari and";
		System.out.println(s2+" ".concat(s1));
		System.out.println(s1+" "+s2);
		
		//indexOf('a')
		System.out.println(s1+"________");
		System.out.println(s1.indexOf('u'));
		
		//lastIndexOf('a')
		System.out.println(s1.lastIndexOf('u'));
		
		System.out.println(s1.replace("is", "are"));
		System.out.println(s1.replaceAll(" ", "xx"));
		
		//subString(index,endindex)
		System.out.println(s1.substring(3, 13));
		System.out.println(s1.substring(3));
		
		//s1.trim()
		System.out.println(s1.trim());
		
		//s1.contains("murugan")
		System.out.println(s1.contains("uru"));
		//s1.startsWith("")
		System.out.println(s1.startsWith("Murugan"));
		//s1.endsWith("")
		System.out.println(s1.endsWith("fri"));
		System.out.println(s1.endsWith("friend"));
		
		//s1.isEmpty()
		System.out.println(s1.isEmpty());
		
		//s1.indexof(String)
		System.out.println(s1.indexOf("is"));
		
		//s1.lastIndexOf("o")
		System.out.println(s1.lastIndexOf("o"));
		
		//s1.toUpperCase()
		System.out.println(s1.toUpperCase());
		
		//s1.toLowerCase("m")
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.matches(""));
		
		String s5="murugan";
		String s6="murugan";
		System.out.println(s5.contentEquals(s6));
		
		char[] c = {'a','b','c','d'};
		
		System.out.println(s1.copyValueOf(c));
		
		String s4=s1.copyValueOf(c);
		System.out.println(s4);
		
		System.out.println(s1.matches(" "));
	}

}
