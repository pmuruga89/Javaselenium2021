package TestngPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	WebDriver driver=null;
	
	
	@Test
	public void loginTest() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\2022 Practice\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Thread no: "+Thread.currentThread().getId());
		System.out.println("Test1: "+driver.hashCode());
		driver.close();

	}
	
	@Test
	public void saveReportTest() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\2022 Practice\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Thread no: "+Thread.currentThread().getId());
		System.out.println("Test2: "+driver.hashCode());
		driver.close();
		
	}
	
}
