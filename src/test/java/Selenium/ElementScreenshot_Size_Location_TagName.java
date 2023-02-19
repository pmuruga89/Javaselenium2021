package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot_Size_Location_TagName {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\2022 Practice\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/tasks/otasklist.do");
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement we = driver.findElement(By.xpath("//a[@id='loginButton']"));
		
		//getTagName
		System.out.println(we.getTagName());
		
		//Getlocation
		System.out.println(we.getLocation());
		
		//Get size
		System.out.println(we.getSize());
		

		//Elements screenshot
		File src = we.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\2022 Practice\\Automation\\Screenshot\\Elementscreenshot.png"));

	}

}
