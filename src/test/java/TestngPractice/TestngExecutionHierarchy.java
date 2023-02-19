package TestngPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngExecutionHierarchy {
	
	@DataProvider(name="murugan")
	public Object[][] data(){
		
		Object obj[][] = {{"muru", "see"}, {"hari","krishna"}};
		return obj;
	}
	

	@Test(dataProvider="murugan")
	public void test1(String s, String t) {
		System.out.println("Test method");
		System.out.println(s +"  "+t);
	}
	
	@BeforeSuite
	public void beforesuite1() {
		System.out.println("Beforesuite -1");
	}
	
	@BeforeTest
	public void beforeTest3() {
		System.out.println("Before Test -3");
	}
	
	@BeforeTest
	public void beforeTest1() {
		System.out.println("Before Test -1");
	}
	
	@BeforeClass
	public void beforeClass1() {
		System.out.println("Before class -1");
	}
	@BeforeClass
	public void beforeClass2() {
		System.out.println("Before class -2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method -1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method -1");
	}
	
	@AfterClass
	public void afterClass1() {
		System.out.println("After class -1");
	}
	
	@AfterClass
	public void afterClass2() {
		System.out.println("After class -2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test -1");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite - 1");
	}
	
	@BeforeSuite
	public void beforesuite2() {
		System.out.println("Beforesuite -2");
	}
	
}
