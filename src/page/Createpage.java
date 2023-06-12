package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage {

	WebDriver driver;
	
	//object repository
	
	By createpagelink=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstartedbutton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	
	
	//Constructor to get browser details
	
	public Createpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//actions 1
	
	public void cretepageclick()
	{
		driver.findElement(createpagelink).click();
	}
	
	
	//action 2
	
	public void getstartedbuttonclick()
	{
		driver.findElement(getstartedbutton).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
