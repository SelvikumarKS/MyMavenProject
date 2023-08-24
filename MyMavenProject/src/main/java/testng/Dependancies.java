package testng;

import org.testng.annotations.Test;

public class Dependancies {

	@Test(enabled =true)
	public void highSchool() {
		System.out.println("High School");
	}

	@Test(dependsOnMethods ="highSchool")
	public void higherSecondarySchool() {
		System.out.println("Higher Second School");
	}

	@Test(dependsOnMethods ="higherSecondarySchool")
	public void college() {
		System.out.println("College");
	}

	@Test(dependsOnMethods="college")
	public void job() {
		System.out.println("Got job");
	}

}
