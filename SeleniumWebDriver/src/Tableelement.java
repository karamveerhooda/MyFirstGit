//Alert and finding and Table element in selenium chrome webdriver.

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tableelement
{

   public static void main(String[] args) throws InterruptedException, AWTException
   {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

      driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
      WebElement table = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody"));
      
      List<WebElement> allrows = table.findElements(By.tagName("tr"));
      System.out.println(allrows.size());
       
      WebElement  row = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr"));
      
      List<WebElement> allcolumns = row.findElements(By.tagName("td"));
      
      System.out.println(allcolumns.size());
      
      for(int i = 1; i<= allrows.size();i++)
      {
    	  for (int j = 1; j<= allcolumns.size(); j++)
    	  {
    		  System.out.println(driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[" + i +"]/td["+j+"]")).getText());
    		  System.out.println("\t");
    	  }
    	  System.out.println();
      }
//      driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
/*      WebElement table = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody"));
      List<WebElement> allrows = table.findElements(By.tagName("tr"));
      System.out.println(allrows.size());
      WebElement row = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr"));
      List<WebElement> allColumns = row.findElements(By.tagName("td"));
      System.out.println(allColumns.size());

      for(int i=1;i<=allrows.size();i++){
         for(int j=1;j<=allColumns.size();j++){
            System.out.print(driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[" + i +"]/td["+j+"]")).getText());
            System.out.print("\t");
         }
         System.out.println();
      }
*/
      /*   driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();

      Alert alert = driver.switchTo().alert();

      alert.sendKeys("Talent++");
      Thread.sleep(3000);
      alert.dismiss();

      //Robot Class - Need to send the keyboard keys

      driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();

      alert = driver.switchTo().alert();
      String x= "sandeep";
      alert.sendKeys(x);

      Robot robot = new Robot();

      robot.keyPress(KeyEvent.VK_TAB);
      robot.keyPress(KeyEvent.VK_SPACE);

      Thread.sleep(3000);

      alert.accept();
*/





































   }

}
