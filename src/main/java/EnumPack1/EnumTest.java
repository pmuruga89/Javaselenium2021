package EnumPack1;

public enum EnumTest {

	CREDITCARD(100), DEBITCARD(1000);
	
	
	private int amt;
	
	EnumTest(int a) {
		this.amt=a;
	}
	
	int getAmount() {
		return amt;
	}
}
