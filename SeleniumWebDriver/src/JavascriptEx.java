import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	 FirefoxProfile profile = new FirefoxProfile();
	 profile.setAcceptUntrustedCertificates(false);
		JavascriptExecutor javascript = (JavascriptExecutor)driver;
		
		
		System.out.println(javascript.executeScript("return document.title"));
		
		WebElement element = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/table/tbody/tr[3]/td[6]"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(element, "Ready");
		int i=1;
		while(i<30){
			javascript.executeScript("return document.ready");
			
		}
		
		
		//string movie = "LOCK"
		
		

	}

}
