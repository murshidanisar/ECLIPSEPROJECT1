package seleniumpractise;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWebpage {

	WebDriver driver;
	
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
}
	
	
@Test
public void screenshot() throws IOException
{
    File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // get screenshot ,return type is file 
    FileHandler.copy(src, new File("C://Users//mursh_ebjye6s//OneDrive//Desktop//screenshot//screenshot1.png"));
    
    
    driver.quit();
    
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
