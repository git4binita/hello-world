package newpackage;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class CookiesRead {
	
	WebDriver driver;
 @BeforeTest
  public void beforeTest() throws Exception
  {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\eclipse-workspace\\OmNamahShivay\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://login.salesforce.com/");
	  Thread.sleep(1000);
  }

	
  @Test
  public void f() throws Exception
  
  {
	// Input Email id and Password If you are already Register		
      driver.findElement(By.id("username")).sendKeys("binita@binita.qa");							
      driver.findElement(By.id("password")).sendKeys("soniqa11");							
      driver.findElement(By.id("Login")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[text()='Remind Me Later']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@class='slds-button' and text()='View All']")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//div[@data-id='02u3h000001FRoQAAW']")).click();
      Thread.sleep(5000);
      
      driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Opportunities']")).click();
     // JavascriptExecutor executor = (JavascriptExecutor)driver;
      //executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("document.querySelector('one-appnav').shadowRoot.querySelector('one-app-nav-bar').shadowRoot.querySelectorAll('one-app-nav-bar-item-root')[1].shadowRoot.querySelector('span.slds-truncate')")));
     
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[@class='forceActionLink' and @role='button']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@class=' input' and @data-aura-rendered-by='2052:0']")).sendKeys("Aaaaa");
      Thread.sleep(2000);
      
   /*
      Thread.sleep(15000);
      driver.findElement(By.id("save")).click();
      
      
      File file = new File("Cookies.data");
      
      try		
      {	  
          // Delete old file if exists
			file.delete();		
          file.createNewFile();			
          FileWriter fileWrite = new FileWriter(file);							
          BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
          // loop for getting the cookie information 		
          	
          // loop for getting the cookie information 		
          for(Cookie ck : driver.manage().getCookies())							
          {			
              Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
              Bwrite.newLine();             
          }			
          Bwrite.close();			
          fileWrite.close();	
          
      }
      catch(Exception ex)					
      {		
          ex.printStackTrace();			
      }		
      
      */
      
  }
 
  @AfterTest
  public void afterTest() throws Exception 
  {
	  Thread.sleep(1000);
	  driver.close();
  }

}
