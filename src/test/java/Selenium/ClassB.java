package Selenium;

import org.openqa.selenium.WebDriver;

public class ClassB {

	WebDriver driver;
	public ClassB(WebDriver driver) {
		this.driver=driver;
	}
	
	public void launch() {
		driver.get("https://www.gmail.com");
	}
}
