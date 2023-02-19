package Selenium;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
  @Test(dataProvider = "dp")
  public void f(String name, String password) {
	  
	  System.out.println("Type userName: "+name);
	  System.out.println("Type password: "+password);
	  
	  System.out.println("Test execution done");
	  
  }
  
  @AfterMethod
  public void teardown(ITestResult result) {
	  
	  if(result.getStatus()==ITestResult.SUCCESS) {
		  
	  }else if(result.getStatus()==ITestResult.FAILURE) {
		  
	  }
	  
	 // result.setTestName("Poda vennai");
  }

  @DataProvider
  public Object dp() {
	  
	  Object obj[][] = {{"murugan", "p"}, {"jeeva", "m"}, {"seetha", "P"}};
	  
	  return obj;
  }
  
  
  
  @AfterSuite
  public void close() {
	  
  }
}
