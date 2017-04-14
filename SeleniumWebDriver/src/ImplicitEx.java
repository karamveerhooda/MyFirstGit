import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitEx
{

   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

      driver.get("http://newtours.demoaut.com");

      //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
      
      driver.findElement(By.name("userName")).sendKeys("tutorial");
      
      //explicit wait
      
      WebDriverWait  wait = new WebDriverWait(driver,10);
      // Ques: it should throw error but not why??
      //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("pasSword"))); 
      //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.name("username"), "tutorial"));
      //wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
      
      
      //To apply implicit wait

      /*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.findElement(By.name("userName")).sendKeys("tutorial");

      //To apply Explicit Wait

      WebDriverWait wait = new WebDriverWait(driver, 20);

      //wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));

      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("password")));

     // wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text))

      //driver.findElement(By.name("password1")).sendKeys("tutorial");
*/   }

private static void If(WebElement b) {
	// TODO Auto-generated method stub
	
}

}
