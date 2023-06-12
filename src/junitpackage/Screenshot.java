package junitpackage;

import java.io.File;
import java.io.IOException;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	
    ChromeDriver driver;
	
@Before
public void open()
{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/mursh_ebjye6s/OneDrive/Desktop/java/alert.html");
}
	
	
	
@Test
public void screenshot() throws IOException
{
	// screenshot of web page
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C:\\Users\\mursh_ebjye6s\\OneDrive\\Desktop\\screenshot.png"));
	
	
	// screenshot of a web element
	WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
	File src1=button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1,new File("./Screenshot/error.png"));
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
