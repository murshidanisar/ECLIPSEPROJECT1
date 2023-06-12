package seleniumpractise;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartXpath {

	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test()
	{
		driver.findElement(By.name("q")).sendKeys("watches",Keys.ENTER);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.switchTo().alert().dismiss();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a/span")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[5]/a/div[1]/div/img")).click();
	    driver.navigate().back();
	    driver.quit();
	    
	    
	    
	    
	    
	    
	    
	    
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
