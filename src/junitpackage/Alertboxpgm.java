package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertboxpgm {

ChromeDriver ob;

@Before
public void open()
{
	ob=new ChromeDriver();
	ob.get("file:///C:/Users/mursh_ebjye6s/OneDrive/Desktop/java/alert.html");
}
	
	    /// alert handling code
	
@Test
public void alert() throws InterruptedException
{
	ob.findElement(By.xpath("/html/body/input[1]")).click();
	
	Alert a=ob.switchTo().alert(); //switch to alert box
	
	String alerttext=a.getText();// get text of alert box
	
	System.out.println(alerttext);// print the alert box text
	
	a.accept();   // accept the value--click ok 
	Thread.sleep(2000);
	
//	
    	ob.findElement(By.xpath("/html/body/input[2]")).sendKeys("Luminar");
    	ob.findElement(By.xpath("/html/body/input[3]")).sendKeys("Technolab");
    	ob.findElement(By.xpath("/html/body/input[4]")).click();
     	Thread.sleep(2000);

}
	
	
	
@After
public void syop()
{
	//ob.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
