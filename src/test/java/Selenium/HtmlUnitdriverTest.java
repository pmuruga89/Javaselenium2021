package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlUnitdriverTest {
	@Test
	public void test1() {
	
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test2() {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement we = driver.findElement(By.id("currentAddress-label"));
		
		Actions act = new Actions(driver);
		act.moveToElement(we).click().click().click().build().perform();
		
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		driver.findElement(By.id("userName")).click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}
}
