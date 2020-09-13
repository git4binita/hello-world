package cicdPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Youtube 
{
  
  	  
	  	WebDriver driver;
	  	
	  	 @BeforeTest
	  	  public void beforeTest() throws InterruptedException 
	  	  {
	  		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\eclipse-workspace\\cicdYoutube\\lib\\chromedriver.exe");
	  		  driver=new ChromeDriver();
	  		  driver.manage().window().maximize();
	  		  driver.get("https://www.youtube.com/");
	  		  Thread.sleep(1000);
	  	  }
	  	
	  	@Test
	    public void f() throws Exception 
	    {
	  	 
	  	  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Selenium Tutorial");
	  	  Thread.sleep(1000);
	  	  
	    }
	   

	    @AfterTest
	    public void afterTest() 
	    {
	  	  driver.close();
	    }
}
