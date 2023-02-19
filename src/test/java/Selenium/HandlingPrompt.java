package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPrompt {
	
	@Test
	public void test1() throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l ));
		driver.manage().window().maximize();
		
		WebElement we = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", we);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println("Title: "+alt.getText());
		
//alert class sendkeys method is used to send only text. we cannot use it for sending the keyboard actions.
		
		
//		alt.sendKeys("murugan");
//		alt.accept();
//		System.out.println("done");
		
//Alternate way is use robot class to handle window and webbased alert.
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
