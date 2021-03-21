package stepDefinitions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testcase1 {
	Logger log=LogManager.getLogger(Testcase1.class.getName());
	@Given("^user is  on homepage$")
	public void user_is_on1_homepage() throws Throwable {
	System.out.println("user is on home page confirmed");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.afrocouple.com");
	log.debug("test success.");
	}
	

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		System.out.println("user navigation is  confirmed");
		log.info("information messages");
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws PendingException {
		System.out.println("user entered username and password confirmed");
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		System.out.println("sucess message is displayed confirmed");
	}


	@When("^user click on the button$")
	public void user_click_on_the_button() throws Throwable {
	    System.out.println("Button is clicked");
	}


}
