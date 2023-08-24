package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Paramterization_Ex {
	
	@Test
	@Parameters("Name")
	public void printName(String name) {
		System.out.println("name is:" +name);
	}

}
