package pom;

import org.openqa.selenium.By;

public class BankingPage extends BaseAction {
	public By customerlogin=By.xpath("//button[text()='Customer Login']");
	public By selectcustomer=By.xpath("//select[@id='userSelect']");
	public By transcations=By.xpath("//button[@ng-click='transactions()']");
	public By deposit=By.xpath("//button[@ng-click='deposit()']");
	public By withdraw=By.xpath("//button[@ng-click='withdrawl()']");
	public By amount= By.xpath("//input[@type='number']");
	public By depositbtn=By.xpath("//button[text()='Deposit']");
	public By withdrawbtn=By.xpath("//button[text()='Withdraw']");
	public By logout=By.xpath("//button[text()='Logout']");
	public By login=By.xpath("//button[text()='Login']");
	public By reset=By.xpath("//button[text()='Reset']");
	public By validation=By.xpath("//span[@class='error ng-binding']");
	public By banklogin=By.xpath("//button[text()='Bank Manager Login']");
	public By addcustomer=By.xpath("//button[@ng-click='addCust()']");
	public By openaccount=By.xpath("//button[@ng-click='openAccount()']");
	public By customers=By.xpath("//button[@ng-click='showCust()']");
	public By firstname= By.xpath("//input[@placeholder='First Name']");
	public By lastname= By.xpath("//input[@placeholder='Last Name']");
	public By postalcode= By.xpath("//input[@placeholder='Post Code']");
	public By addcustomerbtn=By.xpath("//button[text()='Add Customer']");
	public By selectcurrency=By.xpath("//select[@id='currency']");
	public By process=By.xpath("//button[text()='Process']");
	public By searchbox= By.xpath("//input[@placeholder='Search Customer']");
	public By deletecustomer=By.xpath("//button[text()='Delete']");	
	public By home=By.xpath("//button[text()='Home']");	
}
