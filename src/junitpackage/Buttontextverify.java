package junitpackage;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontextverify {

	
ChromeDriver ob;


@Before
public void open()
{
	ob=new ChromeDriver();
	
	ob.get("https://register.rediff.com/register/register.php?ref_id=&murshida");
}
	
	
	
	
	
@Test
public void test()
{
	WebElement button=ob.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));// we store xpath in webelement
	
	String actualbuttontext=button.getAttribute("value"); 
	
	System.out.println("actual text : "+actualbuttontext+"\n");
	
	String exp="Check availability";
	
	if(exp.equals(actualbuttontext))
	{
		System.out.println("pass");
		
	}
	
	else
	{
		System.out.println("fail");
	}
}
	
	
	
	
	
@After
public void stop()
{
	//ob.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
