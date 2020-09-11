package newpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.BufferedReader;		
import java.io.File;		
import java.io.FileReader;		
import java.util.Date;		
import java.util.StringTokenizer;		
import org.openqa.selenium.Cookie;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesWrite		
{		
	 WebDriver driver;  
 
  @BeforeTest
  public void beforeTest() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\eclipse-workspace\\OmNamahShivay\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	 // driver.get("https://login.salesforce.com/");
	 // Thread.sleep(1000);
  }
  
  @Test
  public void f() 
  {
	  
	        
	      					
	      try{			
	       
			          File file = new File("Cookies.data");							
			          FileReader fileReader = new FileReader(file);							
			          BufferedReader Buffreader = new BufferedReader(fileReader);							
			          String strline;			
			          while((strline=Buffreader.readLine())!=null)
			          {									
				          StringTokenizer token = new StringTokenizer(strline,";");									
				          while(token.hasMoreTokens())
				          {					
					          String name = token.nextToken();					
					          String value = token.nextToken();					
					          String domain = token.nextToken();					
					          String path = token.nextToken();					
					          Date expiry = null;					
					          		
					          String val;			
					          if(!(val=token.nextToken()).equals("null"))
					  		  {		
					          	expiry = new Date(val);					
					          }		
					          Boolean isSecure = new Boolean(token.nextToken()).								
					          booleanValue();		
					          Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);			
					          System.out.println(ck);
					          driver.manage().addCookie(ck); // This will add the stored cookie to your current session					
				          }		
			          }		
	          }
	      catch(Exception ex)
	      {					
	    	  		ex.printStackTrace();			
	      }		
	      driver.get("https://na111.lightning.force.com/lightning/setup/SetupOneHome/home");					
	  }	
	  		
  
  

  @AfterTest
  public void afterTest() {
  }

}
