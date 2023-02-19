package LogicalProgram;

public class Replace2ndDuplicateCharInGivenString {

	public static void main(String[] args) {

		String s = "murnuganln";
		
		char ch[] = s.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		
		int j;
		
		for(int i=0;i<ch.length;i++) {
			
			int ctr=0;
			
			for(j=0;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
				
					ctr++;
					if(ctr==2)
					break;
				}
			}
			
			if(ctr==2) {
				
				sb.replace(j, j+1, Character.toString('#'));
				
			}
		}
		
		System.out.println(sb);
	}

}
