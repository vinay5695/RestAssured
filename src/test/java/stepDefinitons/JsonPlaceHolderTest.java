package stepDefinitons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.JsonPlaceHolder;

public class JsonPlaceHolderTest {
WebDriver driver;
JsonPlaceHolder json=new JsonPlaceHolder();

	@Given("I enter the url of the json place holder")
	public void i_enter_the_url_of_the_json_place_holder() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("headless");
	    driver=new ChromeDriver(options);
	    driver.get("https://jsonplaceholder.typicode.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@When("I click the run script button")
	public void i_click_the_run_script_button() {
	   json.clickBtn(driver, json.runscript);
	}
	@Then("I validate the response")
	public void i_validate_the_response() {
		json.validate(driver, json.tokenstring, "\"userId\"");
	}
	
	@When("I click the posts url")
	public void i_click_the_posts_url() {
        json.clickBtn(driver, json.posts);
	}

	@When("I click the comments url")
	public void i_click_the_commentss_url() {
        json.clickBtn(driver, json.comments);
	}
	
	@When("I click the albums url")
	public void i_click_the_albums_url() {
        json.clickBtn(driver, json.albums);
	}
	
	@When("I click the photos url")
	public void i_click_the_photos_url() {
        json.clickBtn(driver, json.photos);
	}
	
	@When("I click the todos url")
	public void i_click_the_todos_url() {
        json.clickBtn(driver, json.todos);
	}
	
	@When("I click the users url")
	public void i_click_the_users_url() {
        json.clickBtn(driver, json.users);
	}
	
	@When("I click the getpost url")
	public void i_click_the_getpost_url() {
        json.clickBtn(driver, json.getpost);
	}
	
	@When("I click the getpost1 url")
	public void i_click_the_getpost1_url() {
        json.clickBtn(driver, json.getpost1);
	}

	@When("I click the getpostcomments url")
	public void i_click_the_getpostcomments_url() {
        json.clickBtn(driver, json.getpostcomments);
	}
	
	@When("I click the postcomments url")
	public void i_click_the_postcomments_url() {
        json.clickBtn(driver, json.getcomments);
	}

	@Then("I validate the response for httpmethods it contains {string}")
	public void i_validate_the_response_for_httpmethods_it_contains(String response) {
		json.validateResponse(driver, json.validationres, response);
	}





	@After("@json")
	public void closes()
	{
		driver.close();
	}

}
