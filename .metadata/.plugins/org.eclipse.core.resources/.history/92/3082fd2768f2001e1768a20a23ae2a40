package Groups;

import org.testng.annotations.Test;

public class _02_Login {
	
	@Test(priority = 1,groups = {"smoke","integration"})
	public void loginwithvalidcredentials(){
		System.out.println("Login - login with valid credentials ");
	}
	
	
	@Test(priority = 2)
	public void loginwithInvalidemail() {
		System.out.println("Login - login with Invalid email");
	}
	
	
	@Test(priority = 3)
	public void loginwithInvalidpassword() {
		System.out.println("Login - login with Invalid password ");
	}
	
	
	@Test(priority = 4,groups = {"smoke"})
	public void loginwthInvalidcredentials() {
		System.out.println("Login - login with Invalid credentials");
	}
	
	
	@Test(priority = 5,groups = {"smoke","integration"})
	public void loginwithoutprovidingcredentials() {
		System.out.println("Login - login without credentials");
	}
	

}
