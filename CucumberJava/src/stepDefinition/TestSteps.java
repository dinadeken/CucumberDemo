package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	
	 
	
	ChromeDriver driver = new ChromeDriver();
	
	
	@Given("User in Login page")
	public void user_in_login_page() {
	
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		
	}
	@When("User view login page successfully")
	public void user_view_login_page_successfully() {
	  Assert.assertTrue(driver.getTitle().contains("The Internet"));
	}
	@When("User enters  {string} and {string}")
	public void user_enters_and(String username, String password) {
		WebElement usernameTxt = driver.findElement(By.id("username"));
		usernameTxt.sendKeys(username);
		WebElement passwordTxt = driver.findElement(By.id("password"));
		passwordTxt.sendKeys(password);
		WebElement loginBtn = driver.findElement(By.className("radius"));
		loginBtn.click();
	}
	@Then("Message displayed login successfully")
	public void message_displayed_login_successfully() {
	  WebElement secureHeader = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2"));
	  Assert.assertTrue(secureHeader.isDisplayed());
	}
	
	@Then("Message displayed your username is invalid")
	public void message_displayed_your_username_is_invalid() {
		WebElement errorDisplay = driver.findElement(By.className("flash error"));
		Assert.assertTrue(errorDisplay.isDisplayed());
	}
	
	@Then("Message displayed your password is invalid")
	public void message_displayed_your_password_is_invalid() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
	}

	

}
