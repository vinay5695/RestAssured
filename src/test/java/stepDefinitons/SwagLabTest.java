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
import junit.framework.Assert;
import pom.HomepageSauce;
import pom.OrderSauce;

public class SwagLabTest {
WebDriver driver;
HomepageSauce hsauce =new HomepageSauce();;
OrderSauce osauce =new OrderSauce();;
	@Given("url of the page")
	public void url_of_the_page() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("headless");
	    driver=new ChromeDriver(options);
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	}
	@When("enter username and password")
	public void enter_username_and_password(DataTable usercredentials) {
		 List<String> data = usercredentials.values();
		 hsauce.typeText(driver, hsauce.username, data.get(0));
		 hsauce.typeText(driver, hsauce.password, data.get(1));
		 hsauce.clickBtn(driver, hsauce.login);
	}
	@Then("log in succuessfully")
	public void log_in_succuessfully() {
    System.out.println("login successfully");
	}
	@When("I click add to cart of backpack")
	public void i_click_add_to_cart_of_backpack() {
		osauce.clickBtn(driver, osauce.backpack);		
	}

	@When("I click add to cart of bikelight")
	public void i_click_add_to_cart_of_bikelight() {
		osauce.clickBtn(driver, osauce.bikelight);
	}

	@When("I click add to cart of tshirt")
	public void i_click_add_to_cart_of_tshirt() {
		osauce.clickBtn(driver, osauce.tshirt);
	}
	
	@When("I click add to cart of jacket")
	public void i_click_add_to_cart_of_jacket() {
		osauce.clickBtn(driver, osauce.jacket);
	}
	
	@When("I click add to cart of onesie")
	public void i_click_add_to_cart_of_onesie() {
		osauce.clickBtn(driver, osauce.onesie);
	}
	
	@When("I click add to cart of redtshirt")
	public void i_click_add_to_cart_of_redtshirt() {
		osauce.clickBtn(driver, osauce.tshirtred);
	}


	@When("I checkout the product")
	public void i_checkout_the_product() {
		osauce.clickBtn(driver, osauce.cart);
		osauce.clickBtn(driver, osauce.checkout);
		osauce.typeText(driver, osauce.firstname, "vinay");
		osauce.typeText(driver, osauce.lastname, "A");
		osauce.typeText(driver, osauce.postalcode, "600001");
		osauce.clickBtn(driver, osauce.continu);
		osauce.clickBtn(driver, osauce.finish);
	}
	@Then("I validate the product order and logged out")
	public void i_validate_the_product_order_and_logged_out() {
		osauce.validate(driver,osauce.validate,"Thank you for your order!");
		osauce.clickBtn(driver, osauce.backhome);
		osauce.clickBtn(driver, osauce.menubtn);
		osauce.clickBtn(driver, osauce.logout);
	}



	@After("@sauce")
	public void closes()
	{
		driver.close();
	}



}
