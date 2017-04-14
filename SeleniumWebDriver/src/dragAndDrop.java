import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class dragAndDrop
{

   public static void main(String[] args)
   {

	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
	   
      WebDriver driver = new ChromeDriver();

      driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
      
      WebElement dragable = driver.findElement(By.xpath("//*[@id='draggable']/p"));
      WebElement dropable = driver.findElement(By.xpath("//*[@id='droppable']"));
      
      //Actions action = new Actions(driver);
      
      //action.dragAndDrop(dragable, dropable).build().perform();
      	  
      //action.dragAndDropBy(dragable, 0, 0).build().perform();
      //action.click(dragable).build().perform();
      //action.moveByOffset(500, 500).build().perform();
      
      
      
      
      
      /*WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));

      WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));


      Actions action = new Actions(driver);

      action.dragAndDrop(draggable, droppable).build().perform();
*/











   }

}
