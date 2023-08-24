
package testng;

import org.testng.annotations.Test;

public class Group_Testcase {
	
	
	@Test(groups={"Apple"})
	public void apple() {
		System.out.println("Apple phone");
	}
	
	@Test(groups={"Apple"})
	public void Apple1() {
		System.out.println("Apple Phone1");
	}
	
	@Test(groups={"Iphone"})
	public void iphone() {
		System.out.println("Iphone");
	}
	
	@Test(groups={"Iphone"})
	public void iphone1() {
		System.out.println("Iphone1");
	}
	
	@Test(groups={"Vivo"})
	public void vivo() {
		System.out.println("Vivo Phone");
	}
	
    @Test(groups={"Vivo"})
    public void vivo1() {
		System.out.println("Vivo Phone1");
	}

    @Test(groups={"Samsung"})
    public void samsung() {
	System.out.println("Samsung");
	}
    
    @Test(groups={"Samsung"})
    public void samsung1() {
	System.out.println("Samsung");
	}
}
