package Tours;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class pageClosing extends Driverclass{
//@Test (priority = 4)
@AfterSuite 	
	public void closethebrowser(){

    driver.close();
	System.out.print("Inside pageClosing class to close the page");
	
	//Loginpage login = new Loginpage();
//	driver.close();	
	}

}
