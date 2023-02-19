package TestngPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTest {
	
	WebDriver driver;
	
	SoftAssert ast = new SoftAssert();
	
	@Test(priority=0)
	public void loginTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Thread no: "+Thread.currentThread().getId());
		
		ast.fail();
		
		System.out.println("Test1: "+driver.hashCode());
		driver.close();
		System.out.println("Test exit");
		//ast.assertAll();
	}
	
}
