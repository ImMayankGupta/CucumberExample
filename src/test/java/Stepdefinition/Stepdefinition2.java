package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition2 {
	
	WebDriver driver;
	
	@Given("^I open the browser for second case$")
	public void i_open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");  	
		driver=new ChromeDriver(); 
	}
	
	@Given("^I open the yahoo$")
	public void i_open_the_yahoo() throws Throwable {
		driver.get("https://www.yahoo.com/");
	}

	@When("^I search some keyword on the yahoo$")
	public void i_search_some_keyword_on_the_yahoo() throws Throwable {
	    driver.findElement(By.id("yschsp")).sendKeys("New York");
	    driver.findElement(By.id("yschsp")).submit();
	    Thread.sleep(3000);
	}

	@Then("^I see some result pages on the yahoo$")
	public void i_see_some_result_pages_on_the_yahoo() throws Throwable {
		Assert.assertTrue(driver.findElement(By.id("results")).isDisplayed());
	    Thread.sleep(3000);
	    driver.close();
	}

}
