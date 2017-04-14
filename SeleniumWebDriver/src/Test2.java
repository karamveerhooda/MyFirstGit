
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Test2
{

   public static void main(String[] args) throws ClassNotFoundException, SQLException
   {
      //WebDriver driver = new FirefoxDriver();
      //driver.get("http://newtours.demoaut.com/");
      /*WebElement username = driver.findElement(By.name("userName"));
      System.out.println(username.getSize().getHeight());
      System.out.println(username.getSize().getWidth());
      System.out.println(username.getLocation().getX());
      System.out.println(username.getLocation().getY());
*/
      //driver.manage().window().setPosition(new Point(100,200));
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
      String dbUrl = "jdbc:mysql://localhost:3306/world";					

		//Database Username		
		String username = "root";	
		//Database Password		
		String password = "davender28";				

		//Query to Execute		
		String query = "select *  from city;";	
      
	    //Load mysql jdbc driver		
 	    Class.forName("com.mysql.jdbc.Driver");			
 
 		//Create Connection to DB		
  	//Connection con = DriverManager.getConnection(dbUrl,username,password);
  	Connection con = DriverManager.getConnection(dbUrl, username, password);

		//Create Statement Object		
	   Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query);							

		// While Loop to iterate through all data and print results
		System. out.println("ID City");
		while (rs.next()){
	        		String myID = rs.getString(1);								        
                  String myCity = rs.getString(2);	
                  System. out.println(myID +"   " +myCity);		
          }		
		 // closing DB Connection		
		con.close();			
}
}
