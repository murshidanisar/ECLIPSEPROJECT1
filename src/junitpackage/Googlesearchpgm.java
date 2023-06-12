package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearchpgm {

	
	ChromeDriver driver;
	
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Google.com");
	}
	
	
	
	@Test
	public void searchverification()
	{
		driver.findElement(By.name("q")).sendKeys("rain images",Keys.ENTER);
		//driver.findElement(By.name("btnk")).click();
	}
	
	
	
	
	
	
	@After
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
