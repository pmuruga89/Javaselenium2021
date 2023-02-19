package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceLabExecution {

	WebDriver driver=null;
	
	@BeforeMethod
	public void setup() {
		System.out.println("Test started");
	}
	
	@Test(description="verifyConsoleLogin")
	public void verifyConsoleLogin() throws MalformedURLException {
		//Test saucelab Manual: PLA-qa2/Password01
		//SauceURL = "http://" + EnvParameters.SAUCE_USER + ":" + EnvParameters.SAUCE_APIKEY+ "@ondemand."+EnvParameters.SAUCE_DATACENTER+".saucelabs.com:80/wd/hub";
	
		
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("name", "verifyConsoleLogin");

		ChromeOptions option = new ChromeOptions();
		option.setCapability("sauce:options", sauceOptions);
		
		
		URL url = new URL("http://PLA-QA2:b5b6991e-7e8f-468f-aff9-ec04bf894611@ondemand.saucelabs.com:80/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN11);
		
		option.merge(dc);
		
		driver = new RemoteWebDriver(url, option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.navigate().to("https://console-stg.pearson.com/console/home");
		driver.findElement(By.xpath("//button[normalize-space()='Create an account']"));

	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("Close browser");
		driver.quit();
	}
	
	
//	String username = System.getenv("SAUCE_USERNAME");
//	String accessKey = System.getenv("SAUCE_ACCESS_KEY");
//	MutableCapabilities sauceOptions = new MutableCapabilities();
//	sauceOptions.setCapability("name", "Web Driver demo Test");
//	sauceOptions.setCapability("tags", "tag1");
//	sauceOptions.setCapability("build", "build-1234");
//	sauceOptions.setCapability("username", username);
//	sauceOptions.setCapability("accessKey", accessKey);
//
//	FirefoxOptions firefoxOptions = new FirefoxOptions();
//	firefoxOptions.setCapability("sauce:options", sauceOptions);
//	firefoxOptions.setCapability("platformName", "Windows 10");
//	firefoxOptions.setCapability("browserVersion", "79.0");
//	WebDriver driver = new RemoteWebDriver(new URL("https://ondemand.us-west-1.saucelabs.com/wd/hub"), firefoxOptions);
	
}
