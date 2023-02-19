package Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ToosQATest {

	@Test
	public void saveReportTest() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444"),dc);
		
		driver.get("https://www.toolsqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Thread no: "+Thread.currentThread().getId());
		System.out.println("Test2: "+driver.hashCode());
		driver.close();
		
	}
}
