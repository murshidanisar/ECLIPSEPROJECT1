package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorspgms {

	ChromeDriver driver;
	
	
	@Before
	public void setup()                   ////  before testing activities
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");    
	}
		
	
	
	@Test
	public void elementverification()
	{
		
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123abc");
		driver.findElement(By.name("login")).click();
		
	}
	
	
	
	
	
	
	
	
	@After
	public void teardown()        //// after testing activities
	{
		driver.quit();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
