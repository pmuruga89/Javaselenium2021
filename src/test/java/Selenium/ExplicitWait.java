package Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		//new EdgeDriver();
		driver.get("http://127.0.0.1/tasks/otasklist.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l ));
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement we = driver.findElement(By.xpath("//a[@id='loginButton']"));

		//WebDriver wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(we));
		wait.until(ExpectedConditions.visibilityOf(we));
		
		
		//Fluent wait
		
		FluentWait<WebDriver> flwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(30))
				.ignoring(NoSuchElementException.class);
				
		flwait.until(ExpectedConditions.elementToBeClickable(we));
		flwait.until(ExpectedConditions.visibilityOf(we));
	
	}

}
