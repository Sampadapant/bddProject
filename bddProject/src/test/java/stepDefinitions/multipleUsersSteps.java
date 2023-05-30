package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multipleUsersSteps {
	WebDriver driver;

	@Given("^user navigates to sauce labs$")
	public void sauceDemo() {
	  driver = new ChromeDriver();  
	  driver.get("https://www.saucedemo.com/");
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String arg1, String arg2) {
		driver.findElement(By.id("user-name")).sendKeys(arg1);
	    driver.findElement(By.id("password")).sendKeys(arg2);
	    driver.findElement(By.id("login-button")).click();

	    
	}

	@Then("^login should be unsuccessful$")
	public void validateRelogin() {
		System.out.println(driver.getTitle());
		  if (driver.getTitle() == "Swag Labs") {
		      System.out.println("test case pass");

		    }

	}
	
	

}
