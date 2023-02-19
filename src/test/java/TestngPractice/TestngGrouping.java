package TestngPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngGrouping {

	@BeforeSuite(alwaysRun = true)
	public void beforesuite() {
		System.out.println("Before suite");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@AfterSuite(alwaysRun = true)
	public void aftersuite() {
		System.out.println("After suite");
	}
	
	@Test(groups="bike")
	public void test1() {
		System.out.println("Bike Test -1 ");
	}
	
	@Test(groups="bike")
	public void test2() {
		System.out.println("Bike Test -2");
	}
	
	@Test(groups="car")
	public void test3() {
		System.out.println("Car Test -3");
	}
	
	@Test(groups="car")
	public void test4() {
		System.out.println("Car Test -4");
	}
	
	@Test(groups= {"car","bike"})
	public void test5() {
		System.out.println("This testcase run for both car and bike");
	}
	
}
