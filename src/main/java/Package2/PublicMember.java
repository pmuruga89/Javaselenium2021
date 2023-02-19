package Package2;

import Package1.ProtectedMember;

public class PublicMember extends ProtectedMember{

	public static void main(String[] args) {

		PublicMember pm = new PublicMember();
		pm.print();
		
	}
}
