package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverification {

	public static void main(String[] args) {
		
		
	ChromeDriver driver=new ChromeDriver();//to open browser
	
	driver.get("https://www.Google.com");  // to load url
		
		
		
	String expecttitle="Google";  // store expected title in a string
	
	String actualtitle=driver.getTitle();// to get actual title of the browser
	
	System.out.println(actualtitle);
	
		
	if(expecttitle.equals(actualtitle))  // to compare two strings
	{
		System.out.println("pass");
	}
	
	
	else
	{
		System.out.println("fail");
	}
		
		
		
		
		
	}

}
