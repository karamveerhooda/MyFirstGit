import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Colorchangeovermousehover {

	private static final String String = null;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
	//	WebElement home = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"));
	    String color = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]")).getCssValue("color");
	    String bgcolor = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]")).getCssValue("background-color");
		//System.out.println("Tagname of given element is :" +home.getCssValue("bgcolor"));
	System.out.println("The color of element is :" +color);  
	System.out.println("The color changed to :" +bgcolor);
	//System.out.println("Color of given element is :" +)
		int width = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).getSize().getWidth();
		int height = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).getSize().getHeight();
		System.out.println("The width of login box is :" +width);  
		System.out.println("The height of login box is :" +height);				
		//home.getCssValue("color");
		Actions action = new Actions(driver);
		
		//action.moveToElement(home).build().perform();
		
		Thread.sleep(5000);
		//System.out.println("Color of given element is :" +home.getCssValue("bgcolor"));
		//System.out.println("Font size of given element is :" +home.getCssValue("font-size"));
		
		
		
		
	}

}
