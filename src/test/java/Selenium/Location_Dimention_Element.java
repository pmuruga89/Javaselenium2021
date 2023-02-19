package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Location_Dimention_Element {

	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		
		//Get location of element;
		
		WebElement we = driver.findElement(By.xpath("//a[@id='loginButton']"));
		
		Point p = we.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println("Location: "+x + " "+y);
		
		//Dimension
		Dimension d = we.getSize();
		int height = d.getHeight();
		int width = d.getWidth();
		System.out.println("Dimension: "+height +" "+width);
		
	}
}
