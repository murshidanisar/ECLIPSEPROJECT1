package junitpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displaylinkpgm {

ChromeDriver ob;


@Before
public void open()
{
	ob=new ChromeDriver();
	
	ob.get("https:/www.facebook.com");
}
	
	
	
	
@Test
public void displaylinks()
{
	List<WebElement>li=ob.findElements(By.tagName("a"));  // store all links in an arraylist
	
    System.out.println(" total links :"+li.size()+"\n\n");  // find total count of links
	
	for(WebElement l:li)  // for each loop--to fetch each link from list
	{
		String link=l.getAttribute("href");// to print attribute use getattribute()
		
		String linktext=l.getText();   // to print text use gettext() method 
		
		System.out.println(link +"----"+linktext);
	}
	
	
	ob.quit();
}


	
	
	

	

	
	
	
	
	
}
