package LogicalProgram;

public class AdamsNumber {

//	 12 is an Adam number
//	 
//	 1. 12 * 12 = 144
//	 2. 21 * 21 = 441
//	 
//	 144 reverse = 441 so 12 is adams number
	
	public static boolean returnAdamsNum(int no) {
		boolean flag =false;
		
		int num =no;
		
		int no1 = (int)Math.pow(num, 2);
		
		//Reverse num
		String s = Integer.toString(num);
		StringBuffer sb = new StringBuffer();
		sb.append(s).reverse();
		int temp = Integer.parseInt(sb.toString());
		
		int no2 = (int)Math.pow(temp, 2);
		
		s = Integer.toString(no2);
		sb = new StringBuffer();
		sb.append(s).reverse();
		temp = Integer.parseInt(sb.toString());
		
		
		
		if(temp==no1) {
			flag =true;
		}
		
		return flag;
	}
	
	public static void main(String args[]) {
		

		for(int i=0;i<1000;i++) {
			
			if(returnAdamsNum(i)) {
				System.out.println(i);
			}
		}
	}
}
