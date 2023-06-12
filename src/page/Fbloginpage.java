package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;




public class Fbloginpage {

	
    WebDriver driver;

// object repository
    
    
    // locating email id text box
	By fbemail=By.name("email");
	
	// locating password text box
	By fbpassword=By.id("pass");
	
	// locating login button
	By fblogin=By.name("login");
	
	
	
// initializing the object using constructor
	
	public Fbloginpage(WebDriver driver )
	{
		this.driver=driver;
	}
	
	
	
//action 1--pass values in email and password field
	
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
	}
	
	
	
// action 2-- click on login button
	
	public void login()
	{
		driver.findElement(fblogin).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
