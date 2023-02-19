package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedIframe {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30l));
		driver.manage().window().maximize();

		//1. Passing webelement
		//WebElement we = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		//driver.switchTo().frame(we);
		
		//2. Passing frame name or id
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("//*[text()='Parent frame']")).getText());
		
		WebElement we = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(we);
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		
		
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("//*[text()='Parent frame']")).getText());
		
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//div[@class='main-header']")).getText());
//		
//		System.out.println("Page title: "+driver.getTitle());
//		
//		driver.close();
	}

}
