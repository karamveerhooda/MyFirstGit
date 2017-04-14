import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class bookmydoctor {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.bookmydoctor.com/");
		driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//*[@id='user_login_id']")).sendKeys("karamveer.hooda");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("davender28");
		driver.findElement(By.xpath("//*[@id='registration_right']/div/div[2]/div/div/table/tbody/tr[3]/td[2]/table/tbody/tr/td[1]/input")).click();
		
		WebElement loginmessage = driver.findElement(By.xpath("//*[@id='registration_right']/div/div[2]/div/div/div/div/span"));
		loginmessage.getText();
		if (loginmessage.getText() == null)
		{
			System.out.println("Login successfull");
		}
		else
		{
			driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[7]/a")).click();
		}
		
		driver.findElement(By.xpath("//input[@id='user_login_id']")).sendKeys("karamveer.hooda");
		driver.findElement(By.xpath("//*[@id='cust_pass']")).sendKeys("davender28");
		driver.findElement(By.xpath("//*[@id='cust_conf_pass']")).sendKeys("davender28");
		driver.findElement(By.xpath("//*[@id='cust_email']")).sendKeys("karamveer.hooda@gmail.com");
		driver.findElement(By.xpath("//*[@id='cust_name']")).sendKeys("karamveer");
		driver.findElement(By.xpath("//*[@id='cust_name2']")).sendKeys("hooda");
		driver.findElement(By.xpath("//*[@id='cust_phone']")).sendKeys("9711904500");
		driver.findElement(By.xpath("//*[@id='cust_country']")).click();
		Select dropdown = new Select(driver.findElement(By.id("cust_country")));
		//List<WebElement> droplist = dropdown.getOptions();
		
		dropdown.selectByValue("99");
		
		
		Select dropstates = new Select(driver.findElement(By.id("cust_state")));
		
		dropstates.selectByVisibleText("Haryana");
		driver.findElement(By.xpath("//input[@id='cust_city']")).sendKeys("Gurgaon");
		driver.findElement(By.xpath("//input[@id='cust_location']")).sendKeys("Sector - 51");
		driver.findElement(By.xpath("//input[@id='cust_phone3']")).sendKeys("122018");
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		
		Select dropmonth = new Select (driver.findElement(By.name("cust_dobmonth")));
		//List<WebElement> dropcalender = dropdate.getOptions();
		dropmonth.selectByVisibleText("Oct");
       
		Select dropdate = new Select(driver.findElement(By.name("cust_dobday")));
		dropdate.selectByVisibleText("28");
		
		Select dropyear = new Select(driver.findElement(By.name("cust_dobyear")));
		dropyear.selectByVisibleText("1980");
		
		
		
		
		
		
		

	}

}
