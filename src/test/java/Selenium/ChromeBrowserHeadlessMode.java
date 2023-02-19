package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserHeadlessMode {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\2022 Practice\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		//options.addArguments("headless");
		options.addArguments("incognito");

		WebDriver driver = new ChromeDriver(options);
		driver.get("http://127.0.0.1/tasks/otasklist.do");
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement we = driver.findElement(By.cssSelector("input[name='username']"));
		we.sendKeys("admin");
		
		we = driver.findElement(By.name("pwd"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='manager'", we);
		
		System.out.println("Execution done");

	}

}
