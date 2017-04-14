//list the program, moving items from one block to another, multiSelect , navigate etc.
import java.io.File;
import java.io.IOException;
import java.util.List;
import  org.apache.commons.io.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.FileUtils;
import com.thoughtworks.selenium.webdriven.commands.ClickAt;


public class Listpgm
{

   public static void main(String[] args) throws InterruptedException, IOException
   {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      Thread.sleep(500);
       driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
            //finding element on web page 

            Select drpdown = new Select(driver.findElement(By.name("FromLB")));
            

            /*drpdown.selectByVisibleText("India");
            drpdown.selectByIndex(1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@onclick='move(this.form.FromLB,this.form.ToLB)']")).click();
            */
            List<WebElement> allOptions = drpdown.getOptions();
            System.out.println(allOptions.size());
            
             // code to select one by one country name and move to next block and reversing it. FromLB to ToLB
            // and then ToLB to FromLB.
            for(int i=0;i<allOptions.size();i++){
            	
            	drpdown.selectByIndex(0);
            	Thread.sleep(1000);
            	driver.findElement(By.xpath("//input[@onclick='move(this.form.FromLB,this.form.ToLB)']")).click();
               //System.out.println(allOptions.get(i).getText() +  allOptions.get(i).getAttribute("value"));
            }
            
            Select drpdownback = new Select(driver.findElement(By.name("ToLB")));
            List<WebElement> allOptionsback = drpdownback.getOptions();
            
            for(int j=0;j<allOptionsback.size(); j++)
            {
               	drpdownback.selectByIndex(0);
            	Thread.sleep(1000);
            	driver.findElement(By.xpath("//input[@onclick='move(this.form.ToLB,this.form.FromLB)']")).click();
               //System.out.println(allOptions.get(i).getText() +  allOptions.get(i).getAttribute("value"));
            }


           
      //Select drpDown = new Select(driver.findElement(By.name("country")));

      //drpDown.selectByVisibleText("INDIA");

      //drpDown.selectByValue("14");

      //drpDown.selectByIndex(1);

      /*List<WebElement> allOptions = drpDown.getOptions();
      System.out.println(allOptions.size());

      for(int i=0;i<allOptions.size();i++){
         System.out.println(allOptions.get(i).getText() +  allOptions.get(i).getAttribute("value"));
      }*/


      //System.out.println(drpDown.getFirstSelectedOption().getText());

//   ******************Selecting multiple value in FromLB box*************************   

      Select multiSelectBox = new Select(driver.findElement(By.name("FromLB")));


      multiSelectBox.selectByVisibleText("Russia");
      multiSelectBox.selectByValue("Japan");
      multiSelectBox.selectByIndex(4);

      List<WebElement> allSelectedValues = multiSelectBox.getAllSelectedOptions();

      for(int i=0;i<allSelectedValues.size();i++){
         System.out.println(allSelectedValues.get(i).getText());
      }



      Thread.sleep(3000);
      multiSelectBox.deselectByValue("Russia");
      multiSelectBox.deselectByVisibleText("Japan");
      multiSelectBox.deselectByIndex(4);

      Thread.sleep(3000);

      multiSelectBox.selectByVisibleText("Russia");
      multiSelectBox.selectByValue("Japan");
      multiSelectBox.selectByIndex(4);

      Thread.sleep(3000);

      multiSelectBox.deselectAll();


      //How to capture a screenshot
 
      
      File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
     org.apache.commons.io.FileUtils.copyFile(srcfile, new File("C:\\Users\\punam\\Desktop\\Desktop.captureimage.png"));
      //FileUtils.copyFile(srcfile, new File("C:\\CaptureImage.png"));

       
      //Maximize a window

      driver.manage().window().maximize();

      //Browser Navigation Commands

      driver.navigate().to("http://www.google.com");

      driver.navigate().back();

      driver.navigate().forward();

      driver.navigate().refresh();


/*      WebElement chk_box = driver.findElement(By.xpath("//*[@id='check3']"));

      System.out.println("Check whether checkbox is selected or not -> " + chk_box.isSelected());

      System.out.println("Check whether checkbox is enabled or not -> " + chk_box.isEnabled());

      System.out.println("Check whether checkbox is displayed or not -> " + chk_box.isDisplayed());
      if(chk_box.isSelected()){
         System.out.println("Checkbox is already selected");
      }else{
         driver.findElement(By.xpath("//*[@id='check3']")).click();
      }


      System.out.println("Check whether checkbox is selected or not -> " + chk_box.isSelected());*/
/*

      driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/input")).click();

      */
      Alert alert = driver.switchTo().alert();
      
      
      
      
      
      System.out.println(alert.getText());

      alert.accept();
      //driver.close();
   }

}