import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Fileupload2 {

	public static void main(String[] args) throws InterruptedException, SikuliException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumServer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.zamzar.com");
			
		
		//WebDriverWait  wait = new WebDriverWait(driver,60);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inputFile']"))).click();
		driver.findElement(By.xpath("//*[@id='inputFile']")).click();
		
		Thread.sleep(3000);
		Pattern img1 = new Pattern("C:\\Users\\punam\\Desktop\\Sikuli\\Choosefiles.png");
		Pattern img2 = new Pattern("C:\\Users\\punam\\Desktop\\Sikuli\\filename.png");
		Pattern img3 = new Pattern("C:\\Users\\punam\\Desktop\\Sikuli\\open.png");
				
		Screen screen = new Screen();
		screen.type(img2, "C:\\Users\\punam\\Desktop\\Sikuli\\captureimage.png");
		Thread.sleep(2000);
		screen.click(img3);
		
//		Pattern img1 = new Pattern()
		
		driver.findElement(By.xpath("//*[@id='toExtensionSel']")).click();
		Thread.sleep(2000);
		WebElement Dropselect = driver.findElement(By.xpath("//*[@id='toExtensionSel']"));
		Select select = new Select(Dropselect);
		select.selectByIndex(4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='toEmail']")).sendKeys("karamveer.hooda@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='uploadButton']")).click();
		
		
		
		
		

	}

}
