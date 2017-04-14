package Tours;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.google.gson.Gson;

public class Loginsite extends Driverclass
{
   @Test (priority = 0)
   public void openApp() throws InterruptedException, IOException{

	   Thread.sleep(3000);	   
      Properties prop = new Properties();
      FileInputStream fis = new FileInputStream("C:\\Users\\punam\\Desktop\\Selenium\\toursloginfile.txt");
      prop.load(fis);
      
      System.out.println(prop.getProperty("loginid"));
      System.out.println(prop.getProperty("xpathofuserName"));
      
      /*WebElement loginbox = driver.findElement(By.xpath(prop.getProperty("xpathofusername")));
      Thread.sleep(1000);
      loginbox.sendKeys(prop.getProperty("loginid"));
      */
      
      driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys(prop.getProperty("loginid"));
      driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys(prop.getProperty("password"));
      driver.findElement(By.name("login")).click();
      /*driver.findElement(By.name("userName")).sendKeys("tutorial");
      driver.findElement(By.name("password")).sendKeys("tutorial");
      driver.findElement(By.name("login")).click();*/
   }

   /*@Test
   public void openbnotherSite(){
      driver.get("http://google.com");
   }
*/
   /*@AfterSuite
   public void closeWebDriver(){
      driver.close();*/
   

}
