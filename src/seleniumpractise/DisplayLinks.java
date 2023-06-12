package seleniumpractise;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class DisplayLinks {
	
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
		System.out.println("Total links :"+li.size());
		
		
		for(WebElement l:li)
	   {
//			String links=l.getAttribute("href");
//			String linktext=l.getText();
//			
//			System.out.println(links+"---------"+linktext);
			
			
			System.out.println(l.getAttribute("href"));
			System.out.println(l.getText());
		}
		
	driver.quit();

		
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
