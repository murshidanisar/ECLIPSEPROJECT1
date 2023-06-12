package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparametergooglserch {

ChromeDriver driver;
	
	
@BeforeTest
public void setup()
{
    driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
	
	
	
	
	
	
	
@Parameters("s")
@Test
public void main(String s)
{   
	System.out.println("value="+s);
	
	driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(s,Keys.ENTER);
	
	
}
	
	
	
	
	
	
@AfterTest
public void close()
{
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
}
