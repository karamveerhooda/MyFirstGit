import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleProgram {	
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();		
		driver.get("https://www.amazon.com");
		System.out.println("This is to check the code added in between");
//		driver.close()
		//trying to intimate karamveer via gmail that code has been change
		
		
	}
}
