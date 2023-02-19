package TestngPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class2 {

	@Test
	public void test1() {
		System.out.println("Class2 I am test");
	}
	
	@BeforeMethod
	public void b() {
		System.out.println("Class2 BeforeMethod");
	}
	
	@AfterMethod
	public void a() {
		System.out.println("Class2 After method");
	}
}
