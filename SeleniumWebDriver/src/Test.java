//task - select one by one all value and move to right side 
// when all value selected than move values back to list.

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//ctrl+shift+o-- to get all class of
// select class used 
		
//you can select the value of any dropdown by two ways , by values and by using index.
		//System.setProperties("webdriver.firefox.driver","");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com");
		
		//driver.findElement(By.linkText("REGISTER")).click();
		//Select drpdown = new Select(driver.findElement(By.name("country")));
		//drpdown.selectByVisibleText("INDIA");
		
		
		
		/*List<WebElement> allOptions = drpdown.getOptions();//List is a class
		System.out.println(allOptions.size());
		
		
		
		System.out.println(drpdown.getFirstSelectedOption().getText());
		//to select multiple value in dropdown
		
		Select multiSelectBox = new Select(driver.findElement(By.name("FromLB")));
		
		
		// how to take screenshot of webpage.
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\CaptureImage.png"));
		
		//how to maximise the window?
		
		driver.manage().window().maximize();
		//Browser Navigation commands - to go on next page on same tab
		
		driver.navigate().to("www.google.com");
		//to go back
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
		
		
		//Question - how you refresh your webpage ? 
		
		//Ques: create new tab ?
		
		//absolute xpath and relative xpath
		//starts with html called absolute xpath, and  relative starts with //. 
		//absolute is exact path between source and destination but relative is from some point to destination
		
		//Best path to use in selenium is Relative. 
		//if we dont have ID attribute then it show absolute xpath.
		
		//how to write relative xpath?
		//webdriver element locator?? - addon to find the xpath of an element.
		
		//driver.findElement(By.xpath("//input[contains(@name,'firstName')]"));
		
		//login on facebook
		//gmail login
		//registration on netours site.
*/		
		
		
		
		
		
	}

}
