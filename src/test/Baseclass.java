package test;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class Baseclass
{
	
   public WebDriver driver;
	
	
	 @BeforeClass
     public void setup()
      {  
		 
 // initialize the chromedriver
	       driver=new ChromeDriver();
	       
	       
 // code to open the URL
	       driver.get("https://www.facebook.com");
	       
	       
//code to maximize the window 
	       driver.manage().window().maximize();
	       
	       
//code to wait 40 sec
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
      }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
