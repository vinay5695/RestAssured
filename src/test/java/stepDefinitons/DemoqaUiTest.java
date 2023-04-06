package stepDefinitons;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Demoqalogin;

public class DemoqaUiTest {
	WebDriver driver;
	Demoqalogin loginpage=new Demoqalogin();
    String baseurl="https://demoqa.com/";
//	@Given("I enter the demoqa url")
//	public void i_enter_the_demoqa_url() {
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		//options.addArguments("headless");
//	    driver=new ChromeDriver(options);
//	    driver.get("https://demoqa.com/register");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	}
//	@When("I enter required details and click login button")
//	public void i_enter_required_details_and_click_login_button(DataTable userdetails) {
//		List<String> data = userdetails.values();
//	    loginpage.typeText(driver, loginpage.firstname, data.get(0));
//	    loginpage.typeText(driver, loginpage.lastname, data.get(1));
//	    loginpage.typeText(driver, loginpage.username, data.get(2));
//	    loginpage.typeText(driver, loginpage.password, data.get(3));
//	    Wait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
//	    wait.until(ExpectedConditions.elementToBeClickable(loginpage.captacha));
//	    System.out.println("element clickable");
//	    loginpage.clickBtn(driver, loginpage.captacha);
//	    loginpage.clickBtn(driver, loginpage.register);
//	}
//	@Then("I validate the registered successfully")
//	public void i_validate_the_registered_successfully() {
//	    driver.switchTo().alert().accept();
//	}

	@Given("I enter the demoqa url of the login {string}")
	public void i_enter_the_demoqa_url_of_the_login(String url) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("headless");
	    driver=new ChromeDriver(options);
	    driver.get(baseurl+url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@When("I enter username and password")
	public void i_enter_username_and_password(DataTable userdetails) {
		List<String> data = userdetails.values();
	    loginpage.typeText(driver, loginpage.username, data.get(0));
	    loginpage.typeText(driver, loginpage.password, data.get(1));
	    loginpage.clickJse(driver, loginpage.login);
	}
	@Then("I validate login successfully")
	public void i_validate_the_registered_successfully() {
	   loginpage.validateelementpresent(driver, loginpage.logout);
	}

	@Given("I enter the demoqa url of the books")
	public void i_enter_the_demoqa_url_of_the_books() {
		loginpage.clickJse(driver, loginpage.bookstore);
	}
	@When("I click the book")
	public void i_click_the_book() {
	    loginpage.clickJse(driver, loginpage.gitpocket);
	}
	@When("add the book into my collection")
	public void add_the_book_into_my_collection() {
		loginpage.clickJse(driver, loginpage.addcollection);
		//driver.switchTo().alert().accept();
	}
	@When("Delete all books in my collection")
	public void delete_all_books_in_my_collection() {
		loginpage.clickJse(driver, loginpage.profile);
		loginpage.clickJse(driver, loginpage.deletecollection);
		//driver.switchTo().alert().accept();
	}
	@Then("I logged out demo qa")
	public void i_logged_out_demo_qa() {
		loginpage.clickJse(driver, loginpage.logout);
	}

    @After("@Demoqa")
    public void closes()
    {
    	driver.close();
    }



}
