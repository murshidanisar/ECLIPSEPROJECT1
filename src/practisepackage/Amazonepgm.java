package practisepackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonepgm {

	
ChromeDriver driver;


@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	
}
	
	
	
@Test
public void amazon() throws InterruptedException
{
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("abc");
	driver.findElement(By.xpath("//*[@ id=\"continue\"]")).click();
	Thread.sleep(2000);
	
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
