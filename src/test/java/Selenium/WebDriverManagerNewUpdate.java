package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerNewUpdate {

	public static void main(String[] args) {
		
		//Newer verion of WebDriverManager
		
//		WebDriver driver = WebDriverManager.chromedriver().create();
//		driver.get("http://127.0.0.1/tasks/otasklist.do");
//		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		//setting chromeoption
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		
		WebDriver driver = WebDriverManager.chromedriver().capabilities(option).create();
		driver.get("http://127.0.0.1/tasks/otasklist.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
