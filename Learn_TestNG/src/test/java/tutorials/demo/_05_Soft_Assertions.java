package tutorials.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _05_Soft_Assertions {

	
	@Test
	public void demo_class() {
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		/*Create soft assert object*/
		SoftAssert softAssert = new SoftAssert();
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store - Error";
		
				
		/*Assert page title with soft assert*/
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/Error";
		
		/*Assert web URL with soft assert*/
		softAssert.assertEquals(actualURL, expectedURL);
		
		driver.findElement(By.name("search")).sendKeys("HP",Keys.ENTER);
		
		/*Assert searched result on web page with hard assert*/
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());


		softAssert.assertAll();
	}

}
