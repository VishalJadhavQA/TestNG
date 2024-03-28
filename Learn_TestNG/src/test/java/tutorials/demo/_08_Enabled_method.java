package tutorials.demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class _08_Enabled_method {


	@Test()
	public void loginwithvalidcredentials() {
	
		System.out.println("login with valid credentials");

	}
	
	
	/*disabled method using enabled=false*/
	@Test(enabled = false)
	public void loginwithInvalidcredentials() {
		
		System.out.println("login with Invalid credentials");
		
	}
	
	
	
	/*disabled method using @ignore*/
	@Ignore
	@Test
	public void loginwithoutdcredentials() {
		
		System.out.println("login with valid credentials");

	}

}
