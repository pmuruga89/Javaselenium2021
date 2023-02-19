package TestngPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestng {

	@Parameters({"browSerName", "platformName"})
	@Test(groups="car")
	public void test1(String s1, String s2) {
		System.out.println("Parameter 1: "+s1);
		System.out.println("Parameter 2: "+s2);
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
}
