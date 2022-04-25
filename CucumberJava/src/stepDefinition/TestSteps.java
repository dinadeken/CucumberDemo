package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	
	@Given("User in Login page")
	public void user_in_login_page() {
	
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

}
