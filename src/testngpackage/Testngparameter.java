package testngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparameter {

	
	
	
@Parameters("s")	
@Test
public void value(String s)
{
	System.out.println("value="+s);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
