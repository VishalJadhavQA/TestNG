package tutorials.demo;

import org.testng.annotations.Test;

public class _03_Priority_Attribute {
	
	
	
  /* If we mention priority for all test methods and not provide priority for one of the test */
	/*then priority 0 will be assigned */ 
  @Test
  public void demo() {
	  System.out.println("Dafult test Method");
  }
  
  @Test (priority = 1)
  public void First() {
	  System.out.println("First test Method");
	  
  }
    
  @Test (priority = 2)
  public void Second() {
	  System.out.println("Second test Method");
  }
  
  @Test (priority = 3)
  public void Third() {
	  System.out.println("Third test Method");
  }
  
  @Test (priority = 4)
  public void Fourth() {
	  System.out.println("Fourth test Method");
  }
  
  @Test (priority = 5)
  public void Fifth() {
	  System.out.println("Fifth test Method");
  }
  
  
  /*Negative priority can be assigned to priority*/
  @Test (priority = -1)
  public void Negative() {
	  
	  System.out.println("Negative priority test case");
  }
  
  
  
  /*If same priority is assigned to multiple methods, then alphabetical order will be followed*/
  @Test (priority = 6)
  public void seventh () {
	  
	  System.out.println("Seventh test case");
  }
  
  @Test (priority = 6)
  public void Eighth () {
	  
	  System.out.println("Eighth test case");
  }
  


  
  
  
}
