package Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptScrollDown {

	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		
		//Scroll up
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
}
