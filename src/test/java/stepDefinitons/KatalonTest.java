package stepDefinitons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.KatalonPage;

public class KatalonTest {

WebDriver driver;
KatalonPage katalon=new KatalonPage();
	@Given("I enter the katalon url of the login")
	public void i_enter_the_demoqa_url_of_the_login() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("headless");
	    driver=new ChromeDriver(options);
	    driver.get("https://katalon-demo-cura.herokuapp.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    katalon.clickBtn(driver, katalon.makeappointment);
	}
	@When("I enter username and password of katalon")
	public void i_enter_username_and_password(DataTable userdetails) {
		List<String> data = userdetails.values();
	    katalon.typeText(driver, katalon.username, data.get(0));
	    katalon.typeText(driver, katalon.password, data.get(1));
	    katalon.clickJse(driver, katalon.login);
	}
	@Then("I validate katalon login successfully")
	public void i_validate_the_registered_successfully() {
	   System.out.println("katalon demo login successfully");
	}

	@When("I select the facility in dropdown as {string}")
	public void i_select_the_facility_in_dropdown_as(String visibletext) {
       katalon.dropdownSelect(driver, katalon.facility, visibletext);
	}
	@When("click checkbox for hospital readmission")
	public void click_checkbox_for_hospital_readmission() {
		katalon.clickBtn(driver, katalon.hospitalre);
	}
	@When("select healthcare program radio button")
	public void select_healthcare_program_radio_button() {
        katalon.clickBtn(driver, katalon.medicaid);
	}
	@When("select visit date")
	public void select_visit_date() {
		katalon.typeText(driver, katalon.visitdate, "04/04/2023");
	}
	@When("add comments")
	public void add_comments() {
	    katalon.typeText(driver, katalon.comments, "manoj attacked by covid");
	}
	@When("Book appointment")
	public void book_appointment() {
	    katalon.clickBtn(driver, katalon.bookappointment);
	}
	@Then("I validate appointment confirmed and logged out")
	public void i_validate_appointment_confirmed_and_logged_out() {
	    katalon.validate(driver, katalon.confirmation, "Appointment Confirmation");
	    katalon.clickBtn(driver, katalon.logoutmenu);
	    katalon.clickBtn(driver, katalon.logout);
	}

	@After("@katalon")
	public void closeb()
	{
		driver.close();
	}



}
