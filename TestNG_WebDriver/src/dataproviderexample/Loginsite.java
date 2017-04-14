package dataproviderexample;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.google.gson.Gson;

public class Loginsite extends Driverclass
{
   @Test (dataProvider = "getData")
   public void setData(String username, String password) {

	 
	 WebElement loginbox = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"));
	 loginbox.sendKeys(username);
      WebElement pswdbox = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"));
      pswdbox.sendKeys(password);
      
      driver.findElement(By.name("login")).click();
      
       }
 
@DataProvider public Object[][] getData(){
	
	Object[][] data = new Object[1][2];
	
	data[0][0] = "tutorial";
	data[0][1] = "tutorial";
		
	return data;
    }
}
