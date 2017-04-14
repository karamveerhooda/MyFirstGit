import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rechargeitnow {

	public static void main(String[] args) throws InterruptedException, AWTException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.rechargeitnow.com");
		
		//Thread.sleep(3000);
	      WebDriverWait wait = new WebDriverWait(driver,30);
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='transSubscriptionNoID']")));
	      driver.findElement(By.xpath("//*[@id='transSubscriptionNoID']")).sendKeys("9711904500");
		
		
		/*WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id='transSubscriptionNoID']")));
*/
		//click continue 
	    driver.findElement(By.xpath("//*[@id='btn']")).click();
	   // second page
	    
	    //click continue 
		Thread.sleep(3000);
	    //WebDriverWait wait2 = new WebDriverWait(driver,10);
	    driver.findElement(By.xpath("//*[@id='btn']")).click();
	    
	    //WebDriverWait wait3 = new WebDriverWait(driver,10);
		Thread.sleep(15000);
		
		WebElement row = driver.findElement(By.xpath("//*[@id='page-wrap']/div[2]/table/tbody"));
		List<WebElement> tablerow = row.findElements(By.tagName("tr"));
		System.out.println("Number of row in table :" +tablerow.size());
		
		WebElement rown = driver.findElement(By.xpath("//*[@id='page-wrap']/div[2]/table/tbody/tr"));
		List<WebElement> tablecol = rown.findElements(By.tagName("td"));
		System.out.println("Number of Column in table :"+tablecol.size());
		
		for (int i = 1; i<=tablerow.size();i++)
		{
			for(int j = 1 ; j<=tablecol.size();j++)
			{
			WebElement amount = driver.findElement(By.xpath("//*[@id='page-wrap']/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
			String Rate = amount.getText();
			Rate = Rate.trim();
			//System.out.println("Value of Rate field: " +Rate+ " and size :" + Rate.length());						
			if (Rate.equals("500"))
			{
				int temp  = j-1;
				System.out.print("amount 10 printed :" + amount.getText());
				driver.findElement(By.xpath("//*[@id='page-wrap']/div[2]/table/tbody/tr["+i +"]/td["+ temp +"]/input")).click();
				System.out.println("position of element :" +i+" , " + j );
				break;
			}
			}
		}
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='btn']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='btn']")).click();
	    
	    Thread.sleep(15000);
	    driver.findElement(By.xpath("//*[@id='btnguest']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("karamveer");
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("karamveer.hooda@gmail.com");
	    driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("9711904500");
	    driver.findElement(By.xpath("//*[@id='btngr']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@id='mopdiv']/div/div[2]/div/div[1]/label")).click();
	    Thread.sleep(10000);
	    
	    Robot robot = new Robot();
	    WebElement dropselect = driver.findElement(By.id("bankcard"));
	    dropselect.click();
	    robot.keyPress(KeyEvent.VK_DOWN);
	    robot.keyPress(KeyEvent.VK_RIGHT);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='btn']")).click();
	    //driver.findElement(By.name("AirTel")).click();
	    	    
	    //Select drpdown = new Select(driver.findElement(By.xpath("//*[@id='oprauto']")));
	    //List<WebElement> allOptions = drpdown.getOptions();
	    
        
        
	    
	    //drpdown.selectByValue("AirTel");
	    
	    

		
		
		
		
		
		
		
		
		

	}

}
