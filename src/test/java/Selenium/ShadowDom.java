package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDom {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("chrome://downloads/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//return is must here
		WebElement we = (WebElement)js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
		
		js.executeScript("arguments[0].value=''", we);
		js.executeScript("arguments[0].value='murugan'", we);
		
	}

}
