package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


            ///////  Mouse hover program for ebay site by applying waits ///////////

            /////// mouse hover --- moveToElement()   //////

public class Mousehoverpgmactions {

	
ChromeDriver driver;


@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}

	
	
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.ebay.com/");
}
	
		
@Test
public void mousehover()
{
	
	driver.manage().window().maximize();// to maximize window
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// to apply implicit wait
	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	
	Actions act=new Actions(driver);
	act.moveToElement(electronics);
	act.perform();
	
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	
	
	
	
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
