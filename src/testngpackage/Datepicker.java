package testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {

WebDriver driver;


@BeforeTest
public void urlloading()
{
	driver=new ChromeDriver();
	driver.get("https://www.Expedia.com");
	driver.manage().window().maximize();
	
}
	
	
	
	
@Test
public void datepick()
{   
	// click flights 
	driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span")).click();
	
	// click departing
	driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
	
	while(true)
	{
		WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/h2"));
		String actualmonth=month.getText();           
		
		if(actualmonth.equals("September 2023"))
		{
			System.out.println(actualmonth);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
		}
		
	}
	
	
	
	List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
	                                                      
	for(WebElement dateelement:alldates)
	{
		String date=dateelement.getAttribute("data-day");
		
		if(date.equals("14"))
		{
			
			System.out.println(date);
			dateelement.click();
			System.out.println("Date selected");
		}
	}
	
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
