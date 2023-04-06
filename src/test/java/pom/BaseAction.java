package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public abstract class BaseAction implements UiAction {
 
	@Override
	public void typeText(WebDriver driver, By by, String text) {
	 driver.findElement(by).sendKeys(text);		
	}
	@Override
	public void clickBtn(WebDriver driver, By by) {
		driver.findElement(by).click();
	}
	@Override
	public void validate(WebDriver driver, By by, String text) {
	 Assert.assertEquals(driver.findElement(by).getText(), text);		
	}	
	@Override
	public void validateResponse(WebDriver driver, By by, String text) {
	 Assert.assertTrue(driver.findElement(by).getText().contains(text));		
	}	
	@Override
	public void validateelementpresent(WebDriver driver, By by)
	{
		Assert.assertTrue(driver.findElement(by).isDisplayed());
	}
	@Override
	public void clickJse(WebDriver driver, By by) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(by));
	}
	@Override
	public void dropdownSelect(WebDriver driver,By by,String visibletext)
	{
		Select dropdown= new Select(driver.findElement(by));
		dropdown.selectByVisibleText(visibletext);
	}
}
