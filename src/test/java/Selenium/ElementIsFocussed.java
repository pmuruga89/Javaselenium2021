package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIsFocussed {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement we1 = driver.findElement(By.id("userName"));
		
		we1.sendKeys("murugan");
		
		if(we1.equals(driver.switchTo().activeElement())) {
			System.out.println("Yes the element is active");
		}else {
			System.out.println("No the element is not active");
		}
		
	}

}
