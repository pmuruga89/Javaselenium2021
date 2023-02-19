package TestngPractice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsOnGroupsTest {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@Test(groups="smoke")
	public void login() {
		System.out.println("Login successfull");
	}
	
	@Test(dependsOnMethods="login", groups="smoke")
	public void homePageValidation() {
		System.out.println("Home page validation");
		//Assert.fail();
	}
	
	@Test(dependsOnMethods="homePageValidation", groups="smoke")
	public void logout() {
		System.out.println("logout successfull");
		Assert.fail();
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	
	
	//The below test will execute when all the smoke test case got pass
	@Test(dependsOnGroups="smoke")
	public void regressionTest() {
		System.out.println("Started executing the regression test");
	}
}
