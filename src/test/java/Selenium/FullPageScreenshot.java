package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30l));
		driver.get("https://www.flipkart.com/");
		
		File src = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\2022 Practice\\Automation\\Screenshot\\Full.png"));

//Chrome browser not supporting		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30l));
//		driver.get("https://www.flipkart.com/");
		
//		File src = ((ChromeDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		
		
	}
}
