package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KatalonPage extends BaseAction{
	
	public By makeappointment=By.xpath("//a[@id='btn-make-appointment']");
	public By username=By.xpath("//input[@id='txt-username']");
	public By password=By.xpath("//input[@id='txt-password']");
	public By login =By.xpath("//button[@id='btn-login']");
	public By bookappointment=By.xpath("//button[@id='btn-book-appointment']");
	public By facility=By.xpath("//select[@id='combo_facility']");
	public By hospitalre=By.xpath("//input[@id='chk_hospotal_readmission']");
	public By medicare=By.xpath("//input[@id='radio_program_medicare']");
	public By medicaid=By.xpath("//input[@id='radio_program_medicaid']");
	public By none=By.xpath("//input[@id='radio_program_none']");
	public By visitdate=By.xpath("//input[@id='txt_visit_date']");
	public By comments=By.xpath("//textarea[@id='txt_comment']");
	public By confirmation=By.xpath("//div[@class='col-xs-12 text-center']/h2");
	public By logoutmenu=By.xpath("//i[@class='fa fa-bars']");
	public By logout=By.linkText("Logout");
	
}
