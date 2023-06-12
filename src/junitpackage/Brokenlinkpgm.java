package junitpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinkpgm {

ChromeDriver driver;	
	
	
	
@Before
public void open()
{
	driver=new ChromeDriver();
	driver.get("https://www.Google.com");
	driver.manage().window().maximize();
}
	
		
@Test
public void verify()
{
	List<WebElement>li=driver.findElements(By.tagName("a"));// store links in array list
	System.out.println("total number of links :"+li.size());// count of total links
	for(WebElement l:li)// fetch each link from list
	{
		
		String link=l.getAttribute("href");// store links form href to variable link
		
		verify(link);
			
	}
	
}


private void verify(String link) 
{
	  
	try
	{
		URL u=new URL(link);// to get connection of url connection class
		HttpURLConnection con =(HttpURLConnection)u.openConnection();// Type casting- to get connection from http url connection class
		con.connect();                                               // to convert urlconnection class into http urlconnection class
		
		if(con.getResponseCode()==200)
		{
			System.out.println("successful response code=200 ------"+link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("Broken link=404 ------"+link);
		}
			
				
	}
	
	catch (Exception e) 
	{
		System.out.println(e.getMessage());
	}
	
		
}
	
	
	
	
@After
public void stop()
{
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
