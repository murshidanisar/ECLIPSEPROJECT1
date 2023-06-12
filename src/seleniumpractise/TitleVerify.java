package seleniumpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerify {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expecttitle="Google";
		
		if(actualtitle.equals(expecttitle))
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
