package nactetexam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wappalyzerselenium {

	WebDriver driver;
	
	
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.wappalyzer.com/");
	driver.manage().window().maximize();
}
	
	
@Test
public void test() throws InterruptedException
{
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();// click resource
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();// click technologies
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();// click shopify
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a/span")).click();// click createaleadlist
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/button")).click();// select technology

	driver.findElement(By.xpath("//*[@id=\"input-395\"]")).sendKeys("java",Keys.ENTER);// click find a technology and enter java

	
	driver.quit();
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
