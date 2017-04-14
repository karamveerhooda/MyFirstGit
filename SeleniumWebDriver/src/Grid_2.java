import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import junit.framework.Assert;

public class Grid_2 {

	String baseurl, nodeurl;
	
@BeforeTest
public void setup() throws MalformedURLException{
	
	WebDriver driver;
	String baseurl,nodeurl;
	
	baseurl = "http://newtours.demoaut.com/";
	nodeurl = "http://192.168.1.101:5555/wd/hub";
	
	System.setProperty("WebDriver.gecko.driver", "C:\\Users\\punam\\Desktop\\Selenium\\geckodriver.exe");
	DesiredCapabilities capability = DesiredCapabilities.firefox();
	capability.setCapability("marionette", true);
	//WebDriver driver = new MarionetteDriver(capability);
	
	capability.setBrowserName("firefox");
	capability.setPlatform(Platform.WIN10);
	driver = new RemoteWebDriver(new URL(nodeurl),capability);
	}

@Test
public void simpletest(){
	/*driver.get(baseurl);
	Assert.assertEquals("Welcome to mercury tours", driver.getTitle());
    */}
}


