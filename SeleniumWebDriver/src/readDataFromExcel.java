import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readDataFromExcel extends Xls_Reader
{
   public readDataFromExcel(String Path) {
		super(Path);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args)
   {
	   
	   Xls_Reader excel = new Xls_Reader("C:\\Users\\punam\\Desktop\\Selenium\\seleniumexcel.xlsx");	   
	   System.out.println(excel.getrowcount("Sheet1"));
	   
	   //excel.addsheet("My Sheet");
	   //excel.addsheet("New Sheet");
	   //excel.deletesheet("My Sheet");
	   //excel.deletesheet("New Sheet");
	   //excel.deletesheet("My Sheet");
	   excel.setcelldata("Sheet1", "Name", 8, "aana");
	   excel.setcelldata("Sheet1", "Name", 9, "brook");
	   	
	   /*WebDriver driver = new FirefoxDriver();
	   driver.get("http://newtours.demoaut.com");*/
	    
  /*    Xls_Reader excel = new Xls_Reader("C:\\Book1.xlsx");
     System.out.println(excel.getRowCount("Sheet1"));
     WebDriver driver = new FirefoxDriver();

      driver.get("http://newtours.demoaut.com");
      String username = excel.getCellData("Sheet1", "Username",2);
      System.out.println(username);
      String password = excel.getCellData("Sheet1", "Password",2);
      System.out.println(password);
      excel.setCellData("Sheet1", "Username", 15, "Selenium");
      driver.findElement(By.name("userName")).sendKeys(username);
      driver.findElement(By.name("password")).sendKeys(password);
*/   }
}
