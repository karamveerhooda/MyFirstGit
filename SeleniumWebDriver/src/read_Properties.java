import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class read_Properties
{

   public static void main(String[] args) throws IOException
   {
	   
	   
	   Properties prop = new Properties();
	   FileInputStream fis = new FileInputStream("C:\\Users\\punam\\Desktop\\Selenium\\Readfile.txt");
	   
	   prop.load(fis);
	   System.out.println(prop.getProperty("name"));
	   System.out.println(prop.getProperty("country"));
	   
	   
	   
	   
/*      Properties prop = new Properties();

      FileInputStream fis = new FileInputStream("C:\\EclipseWorkSpace\\Test\\src\\OR.properties");

      prop.load(fis);

      System.out.println(prop.getProperty("name"));
      System.out.println(prop.getProperty("country"));
*/
   }

}
