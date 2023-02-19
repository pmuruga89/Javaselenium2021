package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	@Test
	public void test1() {
	
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		WebElement we = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(we);
		System.out.println(driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText());
		
		driver.switchTo().defaultContent();
		
		System.out.println("Page title: "+driver.getTitle());
		
		driver.close();
		
	}
	
	@Test(description="switch to iframe based on index")
	public void test2() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		WebElement we = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(1);
		System.out.println("Frame switched success fully");
	}
	
	
}
