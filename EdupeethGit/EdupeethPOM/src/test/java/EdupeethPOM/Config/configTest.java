package EdupeethPOM.Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class configTest 
{
	/*
	 * public static void main( String[] args ) { System.out.println( "Hello World!"
	 * ); }
	 */
   @Test
   public void sampleSelenium() {
	  
	   System.out.println("Hello Selenium");
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\karam\\Downloads\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
      // System.setProperty("WebDriver.gecko.driver","C:\\Users\\karam\\Downloads\\geckodriver\\geckodriver.exe");
      //WebDriver driver = new FirefoxDriver();

       driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");

   }
   

}
