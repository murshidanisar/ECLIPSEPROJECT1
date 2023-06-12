package testngpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {

	
WebDriver driver;	
	
	
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}
	
	
	
	
	
@Test
public void test() throws IOException 

{
	FileInputStream ob=new FileInputStream("C:\\Users\\mursh_ebjye6s\\OneDrive\\Desktop\\study materials\\Book1.xlsx");// return file details
	XSSFWorkbook wb=new XSSFWorkbook(ob);  // return workbook details
	XSSFSheet sh=wb.getSheet("sheet1");  // return sheet 1 details
	int rowcount=sh.getLastRowNum();  // return last row number //so we get total row
	
	for(int i=1;i<=rowcount;i++)
	{
	
	  String username=	 sh.getRow(i).getCell(0).getStringCellValue();// return  1st row,0th column
	  String password=   sh.getRow(i).getCell(1).getStringCellValue();// return 1st row ,1st column
	  
	  System.out.println("username="+username);
	  System.out.println("passwrod="+password+"\n");
	  
	  driver.findElement(By.name("email")).clear();// clear the field
	  driver.findElement(By.name("email")).sendKeys(username);
	  
	  driver.findElement(By.name("pass")).clear();// clear the field
	  driver.findElement(By.name("pass")).sendKeys(password);
	  
	  driver.findElement(By.name("login")).click();
	  driver.navigate().refresh();// refresh the page
	 
	}
	
	driver.quit();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
