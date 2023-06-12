package practisepackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

///// * Link count of google web page /////


public class Linkcountofgoogle {

	ChromeDriver driver;
	
	
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.Google.com");
}
	
	
	
@Test
public void linkcount()
{
	driver.manage().window().maximize();
	List <WebElement>li=driver.findElements(By.tagName("a"));
	System.out.println("total link count : "+li.size());
	
	driver.quit();
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
