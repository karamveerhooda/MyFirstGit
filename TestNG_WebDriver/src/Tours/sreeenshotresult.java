package Tours;
import java.awt.AWTException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import javax.swing.plaf.FileChooserUI;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

public class sreeenshotresult extends Driverclass
{

@Test (priority = 3)
	public void screenshotmethod() throws InterruptedException, IOException
	{
	Thread.sleep(3000);
	File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  	FileUtils.copyFile(srcfile,new File("C:\\Users\\punam\\Desktop\\Sikuli\\screencapture.png"));
  	System.out.println("test case for Screenshotresult page");	
	}

}
