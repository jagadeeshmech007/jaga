package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SampleDef {
	WebDriver driver;

	@Given("user is on the omrbranch page")
	public void user_is_on_the_omrbranch_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@When("use eners the {string} and {string}")
	public void use_eners_the_and(String username, String password) {

		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");

	}

	@When("user click the login button")
	public void user_click_the_login_button() {

		driver.findElement(By.name("login")).click();
	}

	@Then("user should verify after login success message")
	public void user_should_verify_after_login_success_message() {

		Assert.assertEquals("verify success message", "condition");
		driver.quit();
	}

}
