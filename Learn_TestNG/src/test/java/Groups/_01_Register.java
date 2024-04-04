package Groups;

import org.testng.annotations.Test;


@Test(groups = {"all"}) /*Partial group initialization*/
public class _01_Register {
	
	@Test(priority = 1,groups = {"smoke"})
	public void registerByProvidingMandatoryFields() {
		
		System.out.println("Register - Register by providing mandatory fields");
	}

	
	@Test(priority = 2,groups = {"integration"})
	public void registerByProvidingAllFields() {
		
		System.out.println("Register - Register by providing all fields");
	}
	
	
	@Test(priority = 3)
	public void registerByNotProvidingAnyFields() {
		
		System.out.println("Register - Register by not providing any fields");
	}
	
	@Test(priority = 4)
	public void registerByDuplicateEmail() {
		
		System.out.println("Register - Register by Duplicate Email address");
	}
	
	
	
	
}