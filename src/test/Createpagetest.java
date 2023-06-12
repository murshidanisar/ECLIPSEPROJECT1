package test;


import org.testng.annotations.Test;

import page.Createpage;

public class Createpagetest  extends Baseclass 
{

	
 
	
	
@Test
public void createpagetest()
{
	Createpage ob2=new  Createpage(driver);
	ob2.cretepageclick();
	ob2.getstartedbuttonclick();
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
