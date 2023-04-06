package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface UiAction {
	
	void typeText(WebDriver driver,By by,String text);
	void clickBtn(WebDriver driver,By by);
	void validate(WebDriver driver, By by,String text);
	void validateResponse(WebDriver driver, By by,String text);
	void validateelementpresent(WebDriver driver, By by);
	void clickJse(WebDriver driver,By by);
	void dropdownSelect(WebDriver driver,By by,String visibletext);
}
