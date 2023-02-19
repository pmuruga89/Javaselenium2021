package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick_RightClick {

	@Test
	public void test() throws AWTException {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement we = driver.findElement(By.id("doubleClickBtn"));
		
		Actions act = new Actions(driver);
		act.contextClick(we).sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN,Keys.ENTER);
		act.perform();
	}
}
