//import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Opengmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		/*driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("karamveer.hooda");
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys("***");
		driver.findElement(By.id("signIn")).click();
		
		driver.close();
		*/
		Thread.sleep(5000);
		driver.get("http://www.google.com");
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		for (int i = 0; i<=links.size();i++){
			System.out.println("Links present on icicibank webapage are :" +links.get(i).getText());
					}
	}

}
