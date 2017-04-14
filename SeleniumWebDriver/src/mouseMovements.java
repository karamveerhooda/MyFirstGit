import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseMovements
{

   public static void main(String[] args) throws InterruptedException
   {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
	   
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("http://www.Flipkart.com");
	   WebElement main_menu = driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
	   WebElement sub_menu = driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span"));
	   Actions action = new Actions(driver);
	   action.moveToElement(main_menu).build().perform();
      Thread.sleep(3000);
	   sub_menu.click();
	   
	   //WebElement sub_menu = driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span"));
	   //action.moveToElement(sub_menu).build().perform();
	  //sub_menu.click();      
	   
/*      WebDriver driver = new FirefoxDriver();

      driver.get("http://flipkart.com");

      WebElement main_menu = driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a"));

      WebElement sub_menu = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[3]/ul/li[4]/a"));

      Actions action = new Actions(driver);

      action.moveToElement(main_menu).build().perform();

      Thread.sleep(3000);

      sub_menu.click();
*/











   }

}
