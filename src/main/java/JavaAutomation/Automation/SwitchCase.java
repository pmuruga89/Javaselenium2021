package JavaAutomation.Automation;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day:");
		String day = sc.nextLine();
		day = day.toLowerCase();
		
		switch(day) {
		
		case "monday":
			System.out.println("This is monday");
			break;
		case "tuesday":
			System.out.println("Tuesday");
			break;
		case "wednesday":
			System.out.println("wednesday");
			break;
		case "thursday":
			System.out.println("thursday");
			break;
		case "friday":
			System.out.println("friday");
			break;
		case "saturday":
			System.out.println("saturday");
			break;
		case "sunday":
			System.out.println("sunday");
			break;
		default:
			System.out.println("Given day not matching");
		}

	}

}
