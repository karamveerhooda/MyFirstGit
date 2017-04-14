package dataproviderexample;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
public class multiplekeys  {

	@AfterTest
	void newmethod() throws InterruptedException, ATUTestRecorderException
	{
		ATUTestRecorder recorder = new ATUTestRecorder("C:\\Users\\punam\\Desktop\\Selenium","testrecordingmultiple", true );
		//need to check why video is not coming when True is given in 3rd parameter above???????????????????????????????
		recorder.start();
		FirefoxDriver drive = new FirefoxDriver();
		drive.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
	     WebElement dblclk = drive.findElement(By.xpath("//*[@id='post-body-7297556448793668582']/div[1]/button"));
	     drive.manage().window().maximize();
	     Actions action = new Actions(drive);
	     action.doubleClick(dblclk);
	     action.perform();
	     Thread.sleep(3000);
	     String alert_msg  = drive.switchTo().alert().getText();
	     drive.switchTo().alert().accept();
	     System.out.println("alert message :"+alert_msg);
	     // compareto function only count alphabet not spaces not any other character.
	     System.out.println(alert_msg.compareTo("karamveer"));
	     //drive.close();
	     
	     // to enter keys.
	     
	     drive.navigate().to("https://www.google.com");
	     WebElement gglsrchbox = drive.findElement(By.name("q"));
	     gglsrchbox.sendKeys("selenium tutorials");
	     drive.findElement(By.name("btnG")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
	     Thread.sleep(5000);
	     
	     // to right click on any webelement     
	     drive.navigate().to("http://www.myntra.com");
	     JavascriptExecutor JS = (JavascriptExecutor)drive;
	     for(int i =0;i<10;i++)
	     {
	    	 try
	    	 {
	    	 Thread.sleep(1000);
	    	 }catch(Exception e){
	    		 if (JS.executeScript("return document.readystate").toString().equals("complete")){
	    			 System.out.print("status of site opened is :"+JS.executeScript("return document.readystate").toString());
	    			 break;
	    		 }
	    	 }
	    }
	     WebElement manssection = drive.findElement(By.xpath("//*[@id='desktop-headerMount']/div/div/div/div[2]/div[2]/div/div[1]/a"));
	     Actions actiononmans = new Actions(drive);
	     WebElement mensclk= drive.findElement(By.xpath("//*[@id='desktop-headerMount']/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/a[2]"));	     
	     actiononmans.moveToElement(manssection).build().perform();
	      //Actions action2 = new Actions(drive);
	     actiononmans.contextClick(mensclk).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	     Thread.sleep(5000);
	     // To get the handle of window.
	     String windowhandle = drive.getWindowHandle();
	     System.out.println("handle of myntra.com :"+windowhandle);
	     /* Set<String> allwindowhandle = drive.getWindowHandles();
	      Iterator<String> allwindowhandles = allwindowhandle.iterator(); 
	      String parentwindow = allwindowhandles.next();
	      drive.switchTo().window(parentwindow);
	      String childwindow = allwindowhandles.*/
	     drive.close();
	     recorder.stop();
	    }
}