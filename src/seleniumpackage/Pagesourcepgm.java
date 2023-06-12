package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcepgm {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();// to open browser
		driver.get("https://www.Google.com");     // to load url
		
		
		String src=driver.getPageSource();// return source code of page
		
		
		if(src.contains("Gmail"))  // to check a string contain anything we use contain()
		{
			System.out.println(" Gmail is present");
		}
		
		
		else
		{
			System.out.println("not present");
		}
	}

}
