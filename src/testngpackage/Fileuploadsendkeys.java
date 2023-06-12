package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadsendkeys {

WebDriver driver;	
	
	
	
	
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload");
	driver.manage().window().maximize();
}

	
	
	
@Test
public void fileuploading()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.findElement(By.xpath("//*[@ name=\"uploadfile_0\"]  ")).sendKeys("C:\\Users\\mursh_ebjye6s\\OneDrive\\Pictures\\Screenshots\\2023-04-15 (1).png");
	driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
