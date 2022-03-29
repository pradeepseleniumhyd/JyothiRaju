package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPageStepDef {
	
	
	ChromeDriver driver;									// instance variable
	
	
	@Given("user opens the chrome browser")
	public void openBroswer()
	{
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 */	}

	@When("user enteres url")
	public void user_enteres_url() {
		driver.get("https://demoqa.com/automation-practice-form");
		
	}
	@Then("user able to see practice form")
	public void user_able_to_see_practice_form() {
		String actualValue = driver.getTitle();
		System.out.println(actualValue);
	}
	@Then("user verifies Practice Form and Student Registration Form text")
	public void user_verifies_practice_form_and_student_registration_form_text() {
		String header=driver.findElement(By.xpath("//h5")).getText();
		System.out.println(header);
	}


	@When("user enteres url {string}")
	public void user_enteres_url(String url) {
		driver.get(url);
	
	}



	@When("user enters {string} and {string} in Firstname and lastname textboxes")
	public void user_enters_and_in_firstname_and_lastname_textboxes(String fname, String lname) {
		System.out.println(fname);
		System.out.println(lname);
		
	}
	@When("user enters {string} {string} and {string}")
	public void user_enters_and(String email, String mobile, String subject) {
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(subject);
		
	}



	/*
	 * @When("user enters {string} as firstname {string} as lastname {string} as email {string} as mobileno and {string} as subject"
	 * ) public void raju(String fname, String lname,String email, String mobile,
	 * String subject) { //code }
	 * 
	 * @When("user enters {string} as firstname {string} as lastname {string} as email {int} mobileno and {string} as subject"
	 * ) public void raju(String fname, String lname,String email, int mobile,
	 * String subject) { //code }
	 */
	

	@When("user enters {string} as firstname {string} as lastname {string} as email {string} as mobileno and {string} as subject")
	public void user_enters_as_firstname_as_lastname_as_email_as_mobileno_and_as_subject(String fname, String lname, String email, String mobile, String subject) {
	}
	@When("user enters {string} as firstname {string} as lastname {string} as email {int} mobileno and {string} as subject")
	public void user_enters_as_firstname_as_lastname_as_email_mobileno_and_as_subject(String string, String string2, String string3, Integer int1, String string4) {
	}



		@Then("jyothi wants new step")
	public void jyothi_wants_new_step() {
			System.out.println("Jyothi added new step");
		}


			@Then("raju wants new step")
		public void raju_wants_new_step() {
			}

			
					@When("user enters the url")
			public void user_enters_the_url() {
					}
			@Then("FB login page is displayed")
			public void fb_login_page_is_displayed() {
				}
			@When("user enters {string} and password is {string}")
			public void user_enters_and_password_is(String username, String password) {
				System.out.println(username + " " + password);
			}
			@When("user clicks on login button")
			public void user_clicks_on_login_button() {
				}



	@Before(order=2)
	public void browserOpen()
	{
		System.out.println("************************************************************************");
	}

	
	@Before(order = 1)
	public void configopen()
	{
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

	
	
	
	@After
	public void browserClose()
	{
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}

	
}
