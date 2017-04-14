import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.SelectFrame;

public class DeleteYahoomailFromGmail {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("karam.hooda");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("davender");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gbqfq")).sendKeys("from:(@yahoo.com)");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='gbqfb']")).click();
		SelectFrame frm = new SelectFrame(null);
		
		Thread.sleep(5000);
		Robot robot = new Robot();
	    WebElement dropselect = driver.findElement(By.xpath("//*[@id=':10r']/div[1]/span/div"));
	    Thread.sleep(5000);
	    dropselect.click();
	    Thread.sleep(5000);
	    robot.keyPress(KeyEvent.VK_DOWN);
	    robot.keyPress(KeyEvent.VK_ENTER);
		
		
		//driver.findElement(By.id(":10r")).click();
		//driver.findElement(By.xpath("//*[@id=':17h']/div")).click();
		//sel.selectByIndex(0);	
		//driver.findElement(By.xpath("//*[@id=':2o']/div[1]/span")).click();
		
				
	}

}
