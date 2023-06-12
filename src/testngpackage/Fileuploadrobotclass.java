package testngpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Fileuploadrobotclass {

	WebDriver driver;
	
	
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
	
	
	
@Test
public void fileuploading() throws AWTException
{
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	

	fileUpload("C:\\Users\\mursh_ebjye6s\\OneDrive\\Desktop\\scenarios zomato.docx");
}
	
	
	
	public void fileUpload(String p) throws AWTException
	{
		StringSelection strselection=new StringSelection(p);   // to select complete sting
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);// access clip board and set selected file path to the clip board
		
		
		
		Robot robot=new Robot();
		robot.delay(2000);
		 
		/// to paste path to the name field ///
		
		robot.keyPress(KeyEvent.VK_CONTROL); // press control key
		robot.keyPress(KeyEvent.VK_V); // press v key
		
		robot.keyRelease(KeyEvent.VK_CONTROL);  // release control key
		robot.keyRelease(KeyEvent.VK_V);    // release control key
		
		robot.keyPress(KeyEvent.VK_ENTER); // press enter key
		robot.delay(3000);
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter key
	}
		
	
}
