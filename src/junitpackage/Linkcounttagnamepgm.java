package junitpackage;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcounttagnamepgm {

	
ChromeDriver driver;



@Before
public void open()
{
	driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}
	
	
	
	
@Test
public void linkcount()
{
	List<WebElement> li=driver.findElements(By.tagName("a")); //store all links to a list
	
	System.out.println("total count of links:"+li.size()+"\n"); // to find count of links use size()
	
	List<WebElement>l=driver.findElements(By.tagName("li"));
	
	System.out.println("count of footer links :"+l.size());
	
	
	
}
	
	
@After
public void trminate()
{
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
