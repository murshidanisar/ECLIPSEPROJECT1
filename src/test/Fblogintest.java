package test;



import org.testng.annotations.Test;

import page.Fbloginpage;





public class Fblogintest extends Baseclass 
{


	@Test
	public void testlogin()
	{
	    Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("siva@gmail.com", "siva123");
		ob.login();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
