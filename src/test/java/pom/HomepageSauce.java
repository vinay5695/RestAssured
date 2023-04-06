package pom;

import org.openqa.selenium.By;


public class HomepageSauce extends BaseAction {
	
	public By username=By.xpath("//input[@id='user-name']");
	public By password=By.xpath("//input[@id='password']");
	public By login=By.xpath("//input[@id='login-button']");
	
}
