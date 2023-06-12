package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocatorpgm {

	
ChromeDriver ob;	
	
	
	
@Before
public void open()
{
	ob=new ChromeDriver();
	ob.get("https://www.facebook.com");
}
	
	
	
@Test
public void test()
{
	ob.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");// xpath of email field
	
	ob.findElement(By.xpath("//input[@id='pass']")).sendKeys("123abc");  //  xpath of password field
	
	ob.findElement(By.xpath("//button")).click();             // xpath of login button
}
	
	
	
	
	
	
@After
public void terminate()
{
	//ob.quit();
}
	
	
	
	
	
	
	
	
	
	
}
