package General;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day:");
		String day = sc.nextLine();
		
		day = day.toLowerCase();
		
		switch(day) {
		
		case "monday":
			System.out.println("I am monday");
			break;
		case "tuesday":
			System.out.println("I am tuesday");
			break;
		case "wednesday":
			System.out.println("I am wednesday");
			break;
		case "friday":
			System.out.println("I am friday");
			break;
		default:
			System.out.println("I am defalut");
		
		}
	}

}
