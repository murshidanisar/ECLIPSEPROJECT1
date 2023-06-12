package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


      ////// drag and drop program  /////



public class Draganddropactions {

	
ChromeDriver driver;


@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
	
	
	
	
	
@BeforeMethod
public void urlloading()
{
	driver.get("https://demoqa.com/droppable/");
}
	
	
	
	
	
	
@Test
public void draganddrop()
{
	driver.manage().window().maximize();
	WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement drop=driver.findElement(By.xpath("//*[@ id=\"droppable\"]"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(drag,drop);
	act.perform();
	
	
	
	
	// To verify  text after drop
	
	String expcttext="Dropped!";
	String actualtext=drop.getText();
	
	if(expcttext.equals(actualtext))
	{
		System.out.println("text changed to Dropped ");
	}
	else
	{
	    System.out.println("not changed");	
	}
	
	
	
	
	driver.quit();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
