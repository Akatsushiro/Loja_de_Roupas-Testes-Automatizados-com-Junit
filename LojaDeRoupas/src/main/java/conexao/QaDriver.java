package conexao;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class QaDriver {
	public static RemoteWebDriver driver;
	public static final String USERNAME = "akatsushiro1";
	public static final String AUTOMATE_KEY = "p4cdB1nG7LBaA4P5FaFw";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static RemoteWebDriver init() throws MalformedURLException {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "78.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("resolution", "1024x768");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.manage().window().maximize();	
		return driver;
	}
	
	@Before
	public void start() throws MalformedURLException {
		driver = init();
	}
	
	@After
	public void end() {
		if(driver != null) {
			driver.close();
		}
	}
}
