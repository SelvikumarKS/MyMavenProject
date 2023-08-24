package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	
	String  name="selvi";
	boolean value=true;
	@Test
	
	public void checkEqual() {
	/*if(name.equals("Selvi")) {
		System.out.println("Name is equals");
		
	}
	else
	{
		System.out.println("Name is equals");
	}*/
		Assert.assertTrue(value,"This should not be true");
}
}

