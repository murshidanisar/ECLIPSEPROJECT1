package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




        //////  right and double click using actions class and accept alert(handling alert)
        //////  contestClick()--right click
        //////  doubleClick()---double click


public class Actionrightdoubleclick {

	WebDriver driver;
	

		
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
	
	
	
	
@Test
public void test() throws InterruptedException
{
	WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver);
	act.contextClick(rightclick);
	act.perform();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
	driver.switchTo().alert().accept();
	
	
	
	WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	Thread.sleep(2000);
	act.doubleClick(doubleclick);
	act.perform();
	
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	
	
	
	
	driver.quit();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
