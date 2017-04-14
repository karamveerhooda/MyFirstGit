import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
import org.sikuli.script.Screen;


public class fileUpload
{

   public static void main(String[] args) throws FindFailed, InterruptedException
   {
	   
	   System.setProperty("webdriver.chrome.driver",  "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	  
	   driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[1]/input[10]")).click();
	   Pattern img1 = new Pattern("C:\\Users\\punam\\Desktop\\Browse.PNG");
	   Pattern img2 = new Pattern("C:\\Users\\punam\\Desktop\\Name.PNG");
	   Pattern img3 = new Pattern("C:\\Users\\punam\\Desktop\\Save.PNG");
	   Screen screen = new Screen();
//	   screen.type("C:\\Users\\punam\\Desktop\\captureimage.png");
	   Thread.sleep(3000);
	   //screen.click(img1);
	   //Thread.sleep(3000);
	   screen.type(img2,"C:\\Users\\punam\\Desktop\\captureimage.png");
	   //screen.click(img2);
	   Thread.sleep(3000);
	   screen.click(img3);
      /*WebDriver driver = new FirefoxDriver();

      driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");

      driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[1]/input[10]")).click();

      Pattern img1 = new Pattern("C:\\Capture.PNG");

      Screen screen = new Screen();

      screen.type("C:\\Sample.png");

      screen.click(img1);
*/





   }

}
