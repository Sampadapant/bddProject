package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class loginSteps {
	WebDriver driver;
	@Given("I am in sauce lab login page")
	public void i_am_in_sauce_lab_login_page() {
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	}

	@When("I enter valid username")
	public void i_enter_valid_username() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@When("I enetr valid password")
	public void i_enetr_valid_password() {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.cssSelector("#login-button")).click();
	}

	@Then("I will go on homepage")
	public void i_will_go_on_homepage() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	
	
	
}

