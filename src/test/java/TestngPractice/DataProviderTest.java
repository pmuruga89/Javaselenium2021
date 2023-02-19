package TestngPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
  @Test(dataProvider="data")
  public void test1(String s1, String s2, String s3) {
	  
	  System.out.println("S1: "+s1);
	  System.out.println("S2: "+s2);
	  System.out.println("S3: "+s3);
	  System.out.println("__________done__________");
  }
  
  @DataProvider
  public Object data() {
	  
	  Object obj[][] = {{"muru", "see", "Hari"}, {"mathi", "jeeva", "mani"}};
	  
	  return obj;
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
