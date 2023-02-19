package StringStBuffer;

public class StringBufferClass {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		
		sb.append("murugan");
		//sb.append("\n");
		sb.append("hari");
		sb.append("seetha");
		sb.append("krishna");
		
		System.out.println(sb);
		
		sb.setCharAt(1, 'M');
		System.out.println(sb);
		sb.insert(0,'A');
		System.out.println(sb);

		//reverse
		System.out.println(sb.reverse());
		//length
		System.out.println(sb.length());
		
		//hashcode
		System.out.println(sb.hashCode());
		sb.append("jeeva");
		System.out.println(sb.hashCode());
		
		//charAt(int)
		System.out.println(sb.charAt(5));
		for(int i=0;i<sb.length();i++) {
			System.out.print(sb.charAt(i)+" ");
		}
		
		//delete(int start index, end index) range of value
		System.out.println(sb.delete(0, 6));
		System.out.println(sb);
		
		//delete given index value
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		//equals
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		
		sb1.append("murugan");
		sb2.append("murugan");
		System.out.println(sb2.hashCode());
		System.out.println(sb1.hashCode());
		System.out.println(sb1.equals(sb2));
		
		sb1=sb2;
		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.hashCode());
		System.out.println(sb1.hashCode());
		
		//indexof
		System.out.println(sb.reverse());
		System.out.println(sb.indexOf("muru"));
	
		//lastIndexOf()
		System.out.println(sb.lastIndexOf("ee"));
		
		//insert(index, "sadf")
		System.out.println(sb.indexOf("mur"));
		sb.insert(5, "seetha");
		System.out.println(sb);
		
		//setLength(0)
		System.out.println(sb1.length());
		sb1.setLength(2);
		System.out.println(sb1);
		
		//sb.trimToSize()
		System.out.println(sb.insert(5,"  "));
		System.out.println(sb);
		sb.trimToSize();
		System.out.println(sb);
		System.out.println(sb.append("  "));
		sb.trimToSize();
		System.out.println(sb);
		
		//subString();
		System.out.println(sb);
		System.out.println(sb.substring(0,8 ));
		System.out.println(sb);
		
		//toString()
		String s1 = sb.toString();
		System.out.println(s1);
		
		//replace
		System.out.println(sb);
		sb.replace(0, 9, "Hello");
		System.out.println(sb);
	}

}
