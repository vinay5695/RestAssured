package pom;

import org.openqa.selenium.By;

public class Demoqalogin extends BaseAction{

	public By firstname=By.xpath("//input[@id='firstname']");
	public By lastname=By.xpath("//input[@id='lastname']");
	public By username=By.xpath("//input[@id='userName']");
	public By password=By.xpath("//input[@id='password']");
	public By captacha=By.cssSelector("//div.recaptcha-checkbox-border");
	public By register=By.xpath("//button[@id='register']");
	public By login=By.xpath("//button[@id='login']");
	public By logout=By.xpath("//button[text()='Log out']");
	public By gitpocket=By.partialLinkText("Git Pocket");
	public By learnjava=By.partialLinkText("Learning Java");
	public By designingevol=By.partialLinkText("Designing Evolv");
	public By speakingjava=By.partialLinkText("Speaking Java");
	public By youdontjs=By.partialLinkText("You Don");
	public By programmingjava=By.partialLinkText("Programming Java");
	public By eloquentjava=By.partialLinkText("Eloquent Java");
	public By understandindecma=By.partialLinkText("Understanding ECMA");
	public By addcollection=By.xpath("//button[@id='addNewRecordButton']");
	public By deletecollection=By.xpath("//button[text()='Delete All Books']");
	public By profile=By.xpath("//span[text()='Profile']");
	public By bookstore=By.xpath("//span[text()='Book Store']");
}
