package dataproviderexample;
import java.util.concurrent.TimeUnit;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.google.gson.Gson;

import atu.testrecorder.ATUTestRecorder;

public class Driverclass 
{
	
		static  WebDriver driver = null;
	    static ATUTestRecorder recorder = null;
	
	   @BeforeSuite
	   public void createWebDriverInstance() throws ATUTestRecorderException{
		   recorder = new ATUTestRecorder("C:\\Users\\punam\\Desktop\\Selenium","testrecording", true );
		   recorder.start();
	      driver = new FirefoxDriver();
	      driver.get("http://newtours.demoaut.com");
	      JavascriptExecutor js = (JavascriptExecutor)driver;

	      //This loop will rotate for 100 times to check If page Is ready after every 1 second.
	      //You can replace your if you wants to Increase or decrease wait time.
	      for (int i=0; i<10; i++)
	      { 
	          try 
	          {
	              Thread.sleep(1000);
	          }catch (InterruptedException e) {} 
	          //To check page ready state.
	          if (js.executeScript("return document.readyState").toString().equals("complete"))
	          { 
	              System.out.println("status of site opened is :" + js.executeScript("return document.readyState").toString());
	        	  break; 
	          }   
	        }
	      }
}
