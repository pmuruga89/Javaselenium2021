package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	@Test(enabled=false)
	public void action1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement we = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		
		
	}
	
	@Test(description="dragAndDropBy", enabled=false)
	public void action2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.id("dragBox"));
		
		
//		Point pt = src.getLocation();
//		int x = pt.getX();
//		int y = pt.getY();
//		
//		Dimension d = src.getSize();
//		int hg = d.height;
//		int wid  = d.width;
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(src, 250, 0).perform();
	}
	
	
	@Test(description="dragAndDrop")
	public void action3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		act.click();
		
		
		
	}
}
