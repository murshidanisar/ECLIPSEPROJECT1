package seleniumpractise;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	WebDriver driver;
	
   @Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}	
		


    @Test
	public void test()
	{	
	    
	
	    List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total count of links :"+li.size());
		
	 
	
	     for(WebElement l:li)
	      {
		    String links=l.getAttribute("href");
		   
		    verify(links);
	      }
     }



	private void verify(String links)
	{
		 try
			    {
			       URL u=new URL(links);
			       HttpURLConnection con=(HttpURLConnection)u.openConnection();
			       con.connect();
			       
			       if(con.getResponseCode()==200)
			       {
			    	   System.out.println("successful response code=200--------"+links);
			       }
			       else if (con.getResponseCode()==404) 
			       {
					   System.out.println("Broken link=404-------"+links);
					
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
