package Exception1;

public class TryFinallyAlone {

	public static void main(String[] args) {

		try {
			int i=10;
			int j;
						
			j=i/0;
			
		}finally {
			System.out.println("All execution has been done");
		}
		
	}

}
