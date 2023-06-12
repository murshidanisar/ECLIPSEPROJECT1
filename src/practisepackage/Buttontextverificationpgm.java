package practisepackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

////// button text verification pgm for rediffmail check availability button  //////


public class Buttontextverificationpgm {

  ChromeDriver driver;	
	
	
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?ref_id=&murshida");
}
	
	
	
@Test
public void buttonverify()
{
	WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	String actualbuttontext=button.getAttribute("value");
	System.out.println("actual button text :"+ actualbuttontext);
	
	String expectbuttontext="Check availability";
	
	if(expectbuttontext.equals(actualbuttontext))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	
	
driver.quit();	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
