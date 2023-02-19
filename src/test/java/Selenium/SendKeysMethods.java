package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/tasks/otasklist.do");
		WebElement we = driver.findElement(By.cssSelector("input[name='username']"));
		//we.sendKeys("admin11221");
		
		System.out.println(we.getAttribute("value"));
		//Delete
		//we.sendKeys(Keys.HOME,Keys.SHIFT, Keys.END, Keys.DELETE);
		
		//Backspace
		//we.sendKeys(Keys.END, Keys.SHIFT, Keys.HOME, Keys.BACK_SPACE);
		
		//javascript
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//Thread.sleep(1000);
		//clear using javascript
		//js.executeScript("arguments[0].value=''", we);
		
		//Send upper case letter
		we.sendKeys(Keys.SHIFT, "murugan");
		
		System.out.println("Execution done");
		
		driver.quit();
	}

}
