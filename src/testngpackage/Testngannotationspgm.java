package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngannotationspgm {

	ChromeDriver driver;
	
	
	
	
	
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
	
	
	
@BeforeMethod
public void urlloading()
{
	driver.get("https://register.rediff.com/register/register.php?ref_id=&murshida");
}
	
	
	
@Test(priority=1)
public void titleverify()
{
	String exptilte="register.rediff.com";
	String actualtitle= driver.getTitle();
	System.out.println("actual title :"+actualtitle);
	
	if(exptilte.equals(actualtitle))
	{
		System.out.println("pass"+"\n");
	}
	else
	{
		System.out.println("fail"+"\n");
	}
}
	
	
	
	
@Test(priority=2,invocationCount = 2)
public void buttondisplay()
{
	boolean buttonpresent=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).isEnabled();
	System.out.println("button enabled :"+buttonpresent+"\n");
}
	
	
	
	
@Test(priority=3,dependsOnMethods = {"buttondisplay"})
public void buttontextverify()
{
    WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));// we store xpath in webelement
	String actualbuttontext=button.getAttribute("value"); 
	System.out.println("actual text : "+actualbuttontext);
	String exp="Check availability";
	
	if(exp.equals(actualbuttontext))
	{
		System.out.println("pass"+"\n");
		
	}
	
	else
	{
		System.out.println("fail");
	}
}
	
	
	
@AfterMethod
public void aftermethod()
{
	System.out.println("after method"+"\n");
}
	
	
	
@AfterTest
public void aftertest()
{
	driver.quit();
}
	
	
	
}
