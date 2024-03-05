package tutorials.demo;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_Login {

	
	@Test(priority = 1)
	public void LoginWithValidCredentials() {
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("Test.demo@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed());
		
		driver.quit();
		
		
	}

	
	@Test(priority = 2)
	public void LoginWithInvalidCredentials() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(Generatetimestamp());
		driver.findElement(By.id("input-password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//If warning message is displayed for invalid email then pass the test 
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText()
							.contains("Warning: No match for E-Mail Address and/or Password."));
		
		driver.quit();
	}
	
	
	//Create Invalid email using date and time
	public String Generatetimestamp() {
		
		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
		
	
		
		
	}

}
