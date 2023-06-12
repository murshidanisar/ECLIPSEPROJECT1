package seleniumpractise;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ButtontextVerify {

	WebDriver driver;
	
  @Before
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get("https://register.rediff.com/register/register.php?ref_id=&murshida");
	  driver.manage().window().maximize();
  }
	
  
  @Test
  public void test()
  {
	  WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	  String actualbuttontext= button.getAttribute("value");
	  
	  System.out.println("Actual button text :"+actualbuttontext);
	  
	  String expectbuttontext="Check availability";
	  
	  
	  if(expectbuttontext.equals(actualbuttontext))
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
