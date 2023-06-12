package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoverify {

ChromeDriver driver;


@Before
public void open() throws InterruptedException
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?ref_id=&murshida");
	driver.manage().window().maximize();
	Thread.sleep(2000);
}
	
	
	
@Test
public void logoverify()
{
	boolean logopresent=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	System.out.println("logo present :"+logopresent);
	
}
	
	
@After
public void stop()
{
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
