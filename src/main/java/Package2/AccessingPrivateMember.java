package Package2;

import Package1.PrivateMember;

public class AccessingPrivateMember extends PrivateMember{

	public void pmMember() {
		PrivateMember pm = new PrivateMember();
		pm.publicMember();
		//pm.privateMem();private memeber not visible
		
	}
}
