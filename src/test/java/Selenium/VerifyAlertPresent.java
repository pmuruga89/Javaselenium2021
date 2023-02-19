package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyAlertPresent {

	@Test
	public void test1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		// alertIsPresent() condition applied
		if (w.until(ExpectedConditions.alertIsPresent()) == null)
			System.out.println("Alert not exists");
		else
			System.out.println("Alert exists");
			driver.close();
			
	}
}
