package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	WebDriver driver;
	
	@Before
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?ref_id=&murshida");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void test()
	{
		WebElement year =driver.findElement(By.xpath("//*[@ id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select s=new Select(year);
		s.selectByVisibleText("2023");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
