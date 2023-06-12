package practisepackage;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehoverpgm {

	
      ChromeDriver driver;
	
	
	
@BeforeTest
public void setup() 
{
  driver=new ChromeDriver();
  driver.get("https://www.ebay.com");
} 

  
@Test
public void mousehover() 
{
  
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // to wait 30 seconds after each line execution
  
  WebElement electronics=driver.findElement(By.xpath("//*[@ id=\"mainContent\"]/div/ul/li[3]/a"));
  Actions act=new Actions(driver);
  act.moveToElement(electronics).perform();
 
  
  
  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
 
  
  
  
  
 //driver.quit(); 
  
  
  
  
  
  
  
}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
