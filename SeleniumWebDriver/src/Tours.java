import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tours {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	       driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	       
	       //driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/input")).click();
	       /*Alert alert = driver.switchTo().alert();
	       //Thread.sleep(3000);
	       //alert.sendKeys("Learning Selenium");
	       //Thread.sleep(10000);
	       */
	       //use of Robot class
	       driver.findElement(By.xpath("//input[@onclick='myFunction1()']")).click();
	       Alert alert = driver.switchTo().alert();
	       Thread.sleep(5000);
	       alert.sendKeys("karamveer");
	       alert.dismiss();
	       
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//button[@onclick='myFunctionf()']")).click();;	       
	       Alert alert1 = driver.switchTo().alert();
	       
	       Thread.sleep(5000);
	       Robot robot = new Robot();
	       
	       robot.keyPress(KeyEvent.VK_TAB);
	       Thread.sleep(5000);
	       robot.keyPress(KeyEvent.VK_ENTER);
	       Thread.sleep(5000);
	       robot.keyPress(KeyEvent.VK_TAB);
	       Thread.sleep(5000);
	       robot.keyPress(KeyEvent.VK_ENTER);
	       
	             
	       
	       
	       //alert.dismiss();
	       //finding element on web page 
	       //dynamic tables changes row and column but in static rows and column will not change.
	       
//	       /Try table concept on rechargeitnow
	       
	       // exception type : java and selenium exception.
	       // Ques: StaleElementReferenceException comes in selenium , why it comes and how to resolve it.
	       // use www.Github.com  - get above exception when you refer the same element with same name but the page has been 
	       //changed. 
	       //(.//input[@size='10'])[position()=1] -- to reach the repeated element by using the xpath.  Use [positon()=1] or [last() = -1];
	       
	       
	       //how to find the xpath in chrome browser?
	     //*[@id="lst-ib"]
	       
	       /* Ques: $x() is used to write the xpath in chrome ? how to write xpath in chrome?  
	       $x("//input[@name='userName']")  -- used for newtours.demoaut.com username.
// ques for home"
 * uf username is name = user name 1 eg. gmail logoff
 *                                        user naem 2  and so on 
 *                             if starting same           
 *                          //input[starts-with(@name,'username')]
 *                          if ending same
 *                          if starting and ending different
 *                          //input[contains(@name,'userName')]
						    if nothing is same then what?  -- then comes to just previous one .
						    
						    //input[@name=]
                          
 *                          //
 * Ques: how to find prime numbers in java
 * Ques ;; sort array in ascending and descending
 * Ques: read string that it is palindrome or not?
 */
	       
	}

}
