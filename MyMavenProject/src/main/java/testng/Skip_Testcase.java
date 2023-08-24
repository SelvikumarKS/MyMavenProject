package testng;

import org.testng.annotations.Test;

public class Skip_Testcase {
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start The Car");
	}
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("First Gear");
	}
	@Test(priority=2)
	
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	
	@Test(priority=3,enabled=false)
	
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
	@Test(priority=4)
	
	public void putFourthGear() {
		System.out.println("Forth Gear");
	}


}


