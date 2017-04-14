//To find the Stale element exception - 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class staleElementEx
{

   public static void main(String[] args) throws InterruptedException
   {

	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://github.com/");
	   
	   WebElement search_box = driver.findElement(By.name("q"));
	   search_box.sendKeys("hello");
	   search_box.sendKeys(Keys.ENTER);
	   Thread.sleep(5000);
	   driver.findElement(By.name("q"));
	   search_box.clear();
	   
	   /*    WebDriver driver = new FirefoxDriver();

      driver.get("https://github.com/");

      WebElement search_box = driver.findElement(By.name("q"));

      search_box.sendKeys("hello");

      search_box.sendKeys(Keys.ENTER);

      Thread.sleep(7000);

      search_box = driver.findElement(By.name("q"));
      search_box.clear();
*/




   }

}
