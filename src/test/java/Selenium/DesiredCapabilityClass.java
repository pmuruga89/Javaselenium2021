package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DesiredCapabilityClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\2022 Practice\\chromedriver.exe");

		
		ChromeOptions option = new ChromeOptions();
		
		//option.addArguments("headless");
		option.addArguments("incognito");
		option.setAcceptInsecureCerts(true);
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		//adding desiredcapability object into chromeoptions
		option.merge(dc);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://127.0.0.1/tasks/otasklist.do");
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	
	}

}
