package seleniumpractise;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWebelement {

	WebDriver driver;
	
  @Before
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
  }
	
	
  @Test
  public void test() throws IOException
  {
	  WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
	  File src=button.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(src,new File("./screenshot/error2.png"));
	  
	  
	  driver.quit();
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
