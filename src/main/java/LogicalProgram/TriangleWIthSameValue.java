package LogicalProgram;

public class TriangleWIthSameValue {

	public static void main(String[] args) {

//		  	  0 
//		     0 1 
//		    0 1 2 
//		   0 1 2 3 
//		  0 1 2 3 4 
//		 0 1 2 3 4 5 
		 
//		for(int i=0;i<=5;i++) {
//			
//			for(int j=0;j<=5-i;j++) {
//				
//				System.out.print(" ");
//			}
//			
//			for(int k=0;k<=i;k++) {
//				System.out.print(k+" ");
//			}
//			
//			System.out.println();
//		}
		
	
//	       0 
//	      1 1 
//	     2 2 2 
//	    3 3 3 3 
//	   4 4 4 4 4 
//	  5 5 5 5 5 5 
		
//		for(int i=0;i<=5;i++) {
//			
//			for(int j=0;j<=5-i;j++) {
//				
//				System.out.print(" ");
//			}
//			
//			for(int k=0;k<=i;k++) {
//				System.out.print(i+" ");
//			}
//			
//			System.out.println();
//		}

//	       0
//	      11
//	     222
//	    3333
//	   44444
//	  555555
//
//		for(int i=0;i<=5;i++) {
//		
//		for(int j=0;j<=5-i;j++) {
//			
//			System.out.print(" ");
//		}
//		
//		for(int k=0;k<=i;k++) {
//			System.out.print(i);
//		}
//		
//		System.out.println();
//	}
		
		
		
//	       0 
//	      1 2 
//	     3 4 5 
//	    6 7 8 9 
//	   10 11 12 13 14 
//	  15 16 17 18 19 20 
//		int ctr=0;
//		for (int i = 0; i <= 5; i++) {
//			
//			for (int j = 0; j <= 5 - i; j++) {
//
//				System.out.print(" ");
//			}
//
//			for (int k = 0; k <= i; k++) {
//				System.out.print(ctr+" ");
//				ctr++;
//			}
//
//			System.out.println();
//		}	
		

		
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
//		
//		int ctr=1;
//		for (int i = 0; i <5; i++) {
//
//			for (int k = 0; k <= i; k++) {
//				System.out.print(ctr+" ");
//				ctr++;
//			}
//
//			System.out.println();
//		}
//		
//		
		
//	     0
//	    12
//	   345
//	  6789
//		
//		int ctr=0;
//		for (int i = 0; i <5; i++) {
//			
//			for (int j = 0; j <5 - i; j++) {
//
//				System.out.print(" ");
//			}
//
//			for (int k = 0; k <i; k++) {
//				System.out.print(ctr);
//				ctr++;
//			}
//
//			System.out.println();
//		}	
		
		
		
		int ctr=0;
		for (int i = 0; i <5; i++) {
			
			for (int j = 5-i; j>=1; j--) {

				System.out.print(" ");
			}

			for (int k = 0; k <i; k++) {
				System.out.print(ctr);
				ctr++;
			}

			System.out.println();
		}
		
	}
}
