package tutorials.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _04_Hard_Assertions {
  @Test
  public void sampleMethod() {
	  	
	WebDriverManager.chromedriver().clearDriverCache().setup();;
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	
	String actual = driver.getTitle();
	
	String expected = "Your Store";
	
	/*Assert equals*/
	Assert.assertEquals(actual, expected);
	//Assert.assertNotEquals(actual, expected);
	
	
	driver.findElement(By.name("search")).sendKeys("HP",Keys.ENTER);
	
	/*Assert true*/
	Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	//Assert.assertFalse(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	
	
	  
  }
}
