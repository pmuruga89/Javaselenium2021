package Selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30l));
		driver.get("https://demoqa.com/text-box");
		
		WebElement userNametxt = driver.findElement(By.xpath("//input[@id='userName']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='murugan'", userNametxt);
		System.out.println(js.executeScript("arguments[0].getAttribute('id');", userNametxt));
		
		//driver.executeScript("document.getElementById('ID').setAttribute('value','NEW_VALUE');");
	}

}
