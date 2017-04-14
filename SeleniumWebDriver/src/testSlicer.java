import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class testSlicer
{

   public static void main(String[] args)
   {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

      driver.get("http://jqueryui.com/resources/demos/slider/default.html");

      WebElement slicer = driver.findElement(By.xpath("//*[@id='slider']/span"));

      Actions action = new Actions(driver);

      action.dragAndDropBy(slicer, 500, 0).build().perform();

   }

}
