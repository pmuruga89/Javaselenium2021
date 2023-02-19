package TestngPractice;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeGroupAfterGroup {

	//car group
	
	@BeforeGroups(groups="car")
	public void test1() {
		System.out.println("Before group - car");
	}
	@AfterGroups(groups="car")
	public void test2() {
		System.out.println("After group - car");
	}
	
	@Test(groups="car")
	public void test3() {
		System.out.println("Test 1 - car");
	}
	
	@Test(groups="car")
	public void test4() {
		System.out.println("Test 2 - car");
		
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterMethod() {
		System.out.println("After method");
	}
	
	
	//bike
	
	@BeforeGroups(groups="bike")
	public void test5() {
		System.out.println("Before group - bike");
	}
	@AfterGroups(groups="bike")
	public void test6() {
		System.out.println("After group - bike");
	}
	
	@Test(groups="bike")
	public void test7() {
		System.out.println("Test 1 - bike");
	}
	
	@Test(groups="bike")
	public void test8() {
		System.out.println("Test 2 - bike");
	}
}
