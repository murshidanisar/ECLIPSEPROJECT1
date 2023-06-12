package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleverificationpgm {

	ChromeDriver driver;    // driver declared as instance variable
	
	
	
	@Before
	public void setup()                   ////  before testing activities
	{
		driver=new ChromeDriver();
		driver.get("https://www.Google.com");    
	}
		
	
	
	@Test
	public void titleverification()      //// testing activities
	{
		String exp="Google";
		String actual=driver.getTitle();
		
		
		
		if(exp.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
	     
		}
		
		
	}
	
	
	
	
	
	@After
	public void teardown()        //// after testing activities
	{
		driver.quit();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
