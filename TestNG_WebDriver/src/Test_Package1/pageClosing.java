package Test_Package1;

import org.testng.annotations.AfterTest;

public class pageClosing extends Loginpage {

@AfterTest
	public void closethebrowser(){
		
	System.out.print("Inside pageClosing class to close the page");
	
	Loginpage login = new Loginpage();
	login.driver.close();
	
	
	}

}
