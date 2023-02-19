package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {

	public static void main(String[] args) {

		//URL: https://the-internet.herokuapp.com/basic_auth
		
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));
		driver.manage().window().maximize();
		
		
		
	
	}

}
