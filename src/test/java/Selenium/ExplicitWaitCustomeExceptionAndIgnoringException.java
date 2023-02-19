package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


class customeException extends Exception {  
    public customeException(String msg) {  
    super(msg);  
    }  
}  

public class ExplicitWaitCustomeExceptionAndIgnoringException {
	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		List<WebElement>lst = driver.findElements(By.id("currentAddress-label"));

		
		FluentWait<WebDriver>wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(30))
				//Custome Exception
				.ignoring(customeException.class);
				//We can ignore particular exception using this ignore method.
				//.ignoring(StaleElementReferenceException.class);
		
		wait.until(ExpectedConditions.visibilityOf(lst.get(0)));
	}
	
}
