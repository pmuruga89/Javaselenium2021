package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium_4_Locator {

	@Test
	public void testLocators() {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=3mqds5kjg5nc5");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//above[Type user name above pwd field]
//		WebElement pwd = driver.findElement(By.name("pwd"));
//		driver.findElement(with(By.tagName("input")).above(pwd)).sendKeys("admin");
		
		
		//below
//		WebElement username = driver.findElement(By.name("username"));
//		driver.findElement(with(By.tagName("input")).below(username)).sendKeys("manager");
		
		//toRightOf
		//Click the submit button which is right of label
		//driver.findElement(with(By.tagName("a")).toRightOf(By.id("keepLoggedInLabel"))).click();
		
		//toLeftOf
		//driver.findElement(with(By.tagName("input")).toLeftOf(By.id("loginButton"))).click();
		
		
		//near
		//near is helpful when we need to find an element that is at most 50px away from the specified element. 
		driver.findElement(with(By.tagName("input")).near(By.id("loginButton"))).sendKeys("admin");
		
	}
}
