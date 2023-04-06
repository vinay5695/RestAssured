package stepDefinitons;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.BankingPage;

public class BankingTest {
	WebDriver driver;
	BankingPage bank=new BankingPage();

	@Given("I enter the url of banking domain")
	public void i_enter_the_url_of_banking_domain() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("headless");
	    driver=new ChromeDriver(options);
	    driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@When("I click customer login")
	public void i_click_customer_login() {
	    bank.clickBtn(driver, bank.customerlogin);
	}
	
	@When("select the account name {string}")
	public void select_the_account_name(String name) {
	    bank.dropdownSelect(driver, bank.selectcustomer,name);
	    bank.clickBtn(driver, bank.login);
	}
	
	@When("deposit amount of dollar {string}")
	public void deposit_amount_of_dollar(String dollar) {
	    bank.clickBtn(driver, bank.deposit);
	    bank.typeText(driver, bank.amount, dollar);
	    bank.clickBtn(driver, bank.depositbtn);
	    bank.validate(driver, bank.validation, "Deposit Successful");
	}
	
	@When("withdraw amount of dollar {string}")
	public void withdraw_amount_of_dollar(String dollar) {		
		bank.clickBtn(driver, bank.withdraw);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(bank.withdrawbtn));
	    bank.typeText(driver, bank.amount, dollar);
	    bank.clickBtn(driver, bank.withdrawbtn);
	    bank.validate(driver, bank.validation, "Transaction successful");
	}
	
	@Then("I validate the transcation and reset it")
	public void i_validate_the_transcation_and_reset_it() {
	    bank.clickBtn(driver, bank.transcations);
	    bank.clickBtn(driver, bank.reset);
	}
	
	@Then("I have logged out")
	public void i_have_logged_out() {
	    bank.clickBtn(driver, bank.logout);
	}

	@When("I click bank manager login")
	public void i_click_bank_manager_login() {
		bank.clickBtn(driver, bank.banklogin);
	}

	@When("select add customer and provide required details {string} {string} {string}")
	public void select_add_customer_and_provide_required_details(String firstname, String lastname, String postcode) {
		bank.clickBtn(driver, bank.addcustomer);
	    bank.typeText(driver, bank.firstname, firstname);
	    bank.typeText(driver, bank.lastname, lastname);
	    bank.typeText(driver, bank.postalcode, postcode);
	    bank.clickBtn(driver, bank.addcustomerbtn);
	    driver.switchTo().alert().accept();
	}

	@When("open account for the created customer {string} {string} {string}")
	public void open_account_for_the_created_customer(String firstname, String lastname, String currency) {
		bank.clickBtn(driver, bank.openaccount);
		bank.dropdownSelect(driver, bank.selectcustomer, firstname+" "+lastname);
		bank.dropdownSelect(driver, bank.selectcurrency, currency);
		bank.clickBtn(driver, bank.process);
		driver.switchTo().alert().accept();

	}

	@When("delete the created customer {string}")
	public void delete_the_created_customer(String text) {
	   bank.clickBtn(driver, bank.customers);
	   bank.typeText(driver, bank.searchbox, text);
	   bank.clickBtn(driver, bank.deletecustomer);
	   bank.clickBtn(driver, bank.home);
	}	

	@After("@banking")
	public void closeb()
	{
		driver.close();
	}

}
