// login page
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class openApp
{

   public static void main(String[] args) throws InterruptedException
   {
      System.setProperty("webdriver.chrome.driver","C:\\Softwares\\SW\\seleniumserver\\chromedriver.exe");
      //System.setProperty("webdriver.ie.driver","C:\\Softwares\\SW\\seleniumserver\\chromedriver.exe");
     // System.setProperty("webdriver.gecko.driver","C:\\Softwares\\SW\\geckodriver.exe");
      //WebDriver driver = new FirefoxDriver();

      WebDriver driver = new ChromeDriver();
    //WebDriver driver = new InternetExplorerDriver();
      driver.get("http://newtours.demoaut.com");
/*
      driver.findElement(By.name("userName")).sendKeys("tutorial");

      driver.findElement(By.name("password")).sendKeys("tutorial");

      driver.findElement(By.name("login")).click();

      Thread.sleep(5000);

      String expValue="Find a Flight: Mercury Tours:";
     // String actValue = driver.getTitle();

      if(expValue.contentEquals(driver.getTitle())){
         System.out.println("Login is done successfully");
      }else{
         System.out.println("Login is failed");
      }

*/

      driver.findElement(By.linkText("REGISTER")).click();






























   }

}
