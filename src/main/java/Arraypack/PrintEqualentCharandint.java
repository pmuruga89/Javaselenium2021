package Arraypack;

public class PrintEqualentCharandint {

	public static void main(String[] args) {

		int arr[]= {30, 'a', 67,34,99,77,'b'};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((char)arr[i]+" "+arr[i]);
		}
		
		for(char c='a';c<='z';c++) {
			System.out.println(c + " "+(int)c);
		}
		
		for(char c='A';c<='Z';c++) {
			System.out.println(c + " "+(int)c);
		}


	}

}
