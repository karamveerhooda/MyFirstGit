package Test_Package1;

import org.testng.annotations.Test;

public class Test1 {
	
	// give first annotation here
	@Test(priority = 1)
	public void openApp(){
		System.out.println("Opening the website url");
	}
    @Test(priority = 2)
	public void doRegistration(){
    	System.out.println("Fill up the register form");
    }
}
