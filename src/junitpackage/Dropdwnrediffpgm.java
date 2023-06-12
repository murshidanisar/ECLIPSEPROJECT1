package junitpackage;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdwnrediffpgm {

ChromeDriver driver;

@Before
public void open()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?ref_id=&murshida");
	
}
	
	
@Test
public void dropdown()
{
	WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select dayelement=new Select(day);
	dayelement.selectByVisibleText("01");
	List<WebElement>li=dayelement.getOptions();
	System.out.println("total count of day :"+li.size());
	
	
	WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select monthelement=new Select(month);
	monthelement.selectByIndex(2);
	List<WebElement>li1=monthelement.getOptions();
	System.out.println("total count of months :"+li1.size());
	
	
	
	WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select yearelement=new Select(year);
	yearelement.selectByVisibleText("2022");
	List<WebElement>li2=dayelement.getOptions();
	System.out.println("total count of year :"+li2.size());
	
	
	
	
	
	
	
	
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
