package practisepackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//// * load google and locate search field
//// * pass any value in the search field
//// * click search button.



public class Googlesearchlocate {

	
	ChromeDriver driver;
	
	
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
}
	
	
	
	
	
	
@Test
public void search()
{
	driver.findElement(By.name("q")).sendKeys("flowers images",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
	
	
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
