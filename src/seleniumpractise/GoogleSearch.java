package seleniumpractise;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void test()
	{
		driver.findElement(By.name("q")).sendKeys("flowers",Keys.ENTER);
		//driver.findElement(By.name("btnk")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
