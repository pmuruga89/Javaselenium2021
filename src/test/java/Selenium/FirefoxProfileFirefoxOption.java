package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxProfileFirefoxOption {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("incognito");
		//option.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(option);
		driver.get("http://127.0.0.1/tasks/otasklist.do");
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement we = driver.findElement(By.cssSelector("input[name='username']"));
		we.sendKeys("admin");
		
		System.out.println("Test ended");
	}

}
