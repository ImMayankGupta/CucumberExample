package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	WebDriver driver;
	
	@Given("^I open the browser$")
	public void i_open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");  	
		driver=new ChromeDriver(); 
	}

	@Given("^I open the google$")
	public void i_open_the_google() throws Throwable {
	    driver.get("https://www.google.com/");
	}

	@When("^I search some keyword on the google$")
	public void i_search_some_keyword_on_the_google() throws Throwable {
	    driver.findElement(By.name("q")).sendKeys("New York");
	    driver.findElement(By.name("q")).submit();
	    Thread.sleep(3000);
	}

	@Then("^I see some result pages$")
	public void i_see_some_result_pages() throws Throwable {
	    Assert.assertTrue(driver.findElement(By.id("result-stats")).isDisplayed());
	    Thread.sleep(3000);
	    driver.close();
	}

}
