package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonexpathpgm {

ChromeDriver ob;	
	
	
	
@Before
public void open()
{
	ob=new ChromeDriver();
	
	ob.get("https://www.amazon.in");
}
	
	
	
@Test
public void test()
{
    ob.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);//enter a!q in search 
	                                                                                              //and enter search button
	 
	ob.findElement(By.xpath("//*[@id='nav-cart']/div[1]")).click();  //  click cart
	
	ob.findElement(By.xpath("//a[@id='nav-link-accountList']")).click(); //click hello sign-in
	
	ob.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abc@gmail.com"); //enter invalid mail address
	
	ob.findElement(By.xpath("//input[@id='continue']")).click();  // click continue
	
	ob.navigate().back();  // back
	
	ob.navigate().back();   // back
	
	ob.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();  // click todays field
	
	ob.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();  // click hamburger
}
	
	
	
	
	
	
	
@After

	public void terminate()
	{
	  ob.quit();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
