package TestngPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void test1() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		dc.setCapability(CapabilityType.PLATFORM, "Windows10");
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL(""), dc);
	}
}
