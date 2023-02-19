package EnumPack1;

import java.util.PriorityQueue;

public class EDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnumTest creditamt, debitamt;
		
		creditamt = EnumTest.CREDITCARD;
		debitamt = EnumTest.DEBITCARD;
		
		System.out.println(creditamt.getAmount());
		System.out.println(debitamt.getAmount());
		
	}

}
