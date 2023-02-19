package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTooltip {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l ));
		driver.manage().window().maximize();
	
		WebElement we = driver.findElement(By.id("toolTipButton"));
		
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		
		//use F8 or Fun'+F8 on source tab of dev tool
			String s=null;
		System.out.println(driver.findElement(By.xpath("//div[@class='"+s+"']")).getText());

	}

}
