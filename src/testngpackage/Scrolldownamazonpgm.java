package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


  //// program for scroll down amazon site /////


public class Scrolldownamazonpgm {

WebDriver driver;	
	
	
	
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	
}
	
	
	
@Test
public void scrolldown() throws InterruptedException
{   
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollheight)");
	driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[3]/a")).click();
	
	
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
