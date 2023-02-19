package LogicalProgram;

public class PrintAZandNumber {

	public static void main(String[] args) {

		for(char c='A';c<='Z';c++) {
			System.out.print(c +"="+(int)c + "  ");
		}
		
		System.out.println();
		
		for(char c='a';c<'z';c++) {
			System.out.print(c +"="+(int)c + "  ");
		}
	}

}
