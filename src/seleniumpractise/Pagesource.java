package seleniumpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
	driver.quit();	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
