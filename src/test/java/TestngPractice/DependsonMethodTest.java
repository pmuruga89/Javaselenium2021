package TestngPractice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsonMethodTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@Test
	public void login() {
		System.out.println("Login successfull");
	}
	
	@Test(dependsOnMethods="login")
	public void homePageValidation() {
		System.out.println("Home page validation");
		Assert.fail();
	}
	
	@Test(dependsOnMethods="homePageValidation")
	public void logout() {
		System.out.println("logout successfull");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
}
