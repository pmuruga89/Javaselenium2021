package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesTest {

	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Set<Cookie>set = driver.manage().getCookies();
		Iterator<Cookie> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println("Cookie Name: "+itr.next().getName());
			System.out.println("Cookie Path: "+itr.next().getPath());
		}
		
	}
}
