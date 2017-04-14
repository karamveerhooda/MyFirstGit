package Tours;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.google.gson.Gson;

public class Driverclass 
{
	static  WebDriver driver = null;

	   @BeforeSuite
	   public void createWebDriverInstance(){
	      driver = new FirefoxDriver();
	      driver.get("http://newtours.demoaut.com");
	   }

}
