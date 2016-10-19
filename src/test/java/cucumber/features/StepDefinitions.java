package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class StepDefinitions {
	
	WebDriver driver = null;
	
	@Given("^I navigate to the site$")
	public void shouldnavigatetofbsite() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ABTO\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://staging.winlifetimevacations.com");
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='sticky-navigation']/div/div[3]/ul/li/a")).click();
	}
	@And("^Set credentials$")
	public void set_credentials() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='EmailAddress']")).sendKeys("igorstahaw@gmail.com");
        driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("123456");
        driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/div/form/div[2]/div/div[3]/div/div[1]/button")).click();
	}

	@Then("^I check to see that no values are available$")
	public void i_check_to_see_that_no_values_are_available() throws Throwable {
		Assert.assertTrue("No login page", driver.getTitle().equals("Home Page - "));
	}

}
