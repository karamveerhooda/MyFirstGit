import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class testResizeable
{

   public static void main(String[] args)
   {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

      driver.get("http://jqueryui.com/resources/demos/resizable/default.html");

      WebElement resizeable = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));

      Actions action = new Actions(driver);

      action.dragAndDropBy(resizeable, 500, 300).build().perform();














   }

}
