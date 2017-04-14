package Tours;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class onewaytrip extends Driverclass
{
@Test (priority = 1)
public void onewayt() throws InterruptedException{

	Thread.sleep(3000);
	driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	System.out.println("Inside onewaytrip test case");
	driver.findElement(By.name("findFlights")).click();
	}
}
