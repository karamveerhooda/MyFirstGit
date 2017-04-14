//This program is to register on tourist site.
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Test2oct
{

   public static void main(String[] args) throws InterruptedException, IOException
   {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
            driver.get("http://newtours.demoaut.com");
            //finding element on web page 
            driver.findElement(By.linkText("REGISTER")).click();
            
            driver.findElement(By.name("firstName")).sendKeys("karamveer");
            driver.findElement(By.name("lastName")).sendKeys("hooda");
            driver.findElement(By.name("phone")).sendKeys("9711904500");
            driver.findElement(By.name("email")).sendKeys("karamveer.hooda@gmail.com");
            driver.findElement(By.name("address1")).sendKeys("Sec - 51");
            driver.findElement(By.name("address2")).sendKeys("Gurgaon");
            driver.findElement(By.name("state")).sendKeys("Haryana");
            driver.findElement(By.name("address2")).sendKeys("");
            
            Select drpdown = new Select (driver.findElement(By.name("country")));
            drpdown.selectByVisibleText("INDIA");
            
            driver.findElement(By.name("password")).sendKeys("abc123456");
            driver.findElement(By.name("confirmPassword")).sendKeys("abc123456");
            driver.findElement(By.name("register")).click();
            

      /*driver.findElement(By.linkText("REGISTER")).click();

      Select drpDown = new Select(driver.findElement(By.name("country")));
*/
      //drpDown.selectByVisibleText("INDIA");

      //drpDown.selectByValue("14");

      //drpDown.selectByIndex(1);

      /*List<WebElement> allOptions = drpDown.getOptions();
      System.out.println(allOptions.size());

      for(int i=0;i<allOptions.size();i++){
         System.out.println(allOptions.get(i).getText() +  allOptions.get(i).getAttribute("value"));
      }*/


      //System.out.println(drpDown.getFirstSelectedOption().getText());

//      driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");

      /*Select multiSelectBox = new Select(driver.findElement(By.name("FromLB")));

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
*/

      //How to capture a screenshot

      /*File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

      FileUtils.copyFile(srcfile, new File("C:\\CaptureImage.png"));
*/

      //Maximize a window

      /*driver.manage().window().maximize();

      //Browser Navigation Commands

      driver.navigate().to("http://www.google.com");

      driver.navigate().back();

      driver.navigate().forward();

      driver.navigate().refresh();*/


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

      Alert alert = driver.switchTo().alert();

      System.out.println(alert.getText());

      alert.accept();
*/



































      //driver.close();










































   }

}
