package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openbrowser {

	public static void main(String[] args) {
		
// to open chrome browser create object of that browser
		
		ChromeDriver driver=new ChromeDriver();
	
// use get() to load url
		
		driver.get("https://www.Google.com");
		
		
		
		
		
		
// to open edge browser
		
		EdgeDriver driver1=new EdgeDriver();
		
// use get() to load url
				
		driver1.get("https://www.Google.com");
		

		
		
		
		
// to open firefox browser
				
	    FirefoxDriver driver3=new	FirefoxDriver();
		
// use get() to load url	
	
	    driver3.get("https://www.Google.com");
	
	
	
	
		
	}

}
