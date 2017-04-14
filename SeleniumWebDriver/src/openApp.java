//to open a web page and  login 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class openApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\SeleniumServer\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver","C:\\Program Files\\SeleniumServer\\IEDriverServer.exe");
			
		
		WebDriver driver = new HtmlUnitDriver();
		
		//WebDriver driverIE = new InternetExplorerDriver();
		
		
		//WebDriver driver = new InternetExplorerDriver();
		//driver.get("https://www.google.com");
		driver.get("http://newtours.demoaut.com");
		//driverIE.get("http://www.bing.com");
		
		/*driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		String expvalue = " Find a Flight: Mercury Tours:";  // Ques: where is this message on web page??
		String actvalue = driver.getTitle();
		
		System.out.println(actvalue);
		
		
		if(expvalue.contentEquals(driver.getTitle()))
		{
			System.out.println("Login is done successfully");
		}
		
		else{
			System.out.print("Login failed");
			
		}
		*/
		//driver.findElement(By.linkText("REGISTER")).click();
		
		//driver.close();
	int testsi 	= driver.findElements(By.linkText("REGISTER")).size();
		
		System.out.println(testsi);		
}

}
