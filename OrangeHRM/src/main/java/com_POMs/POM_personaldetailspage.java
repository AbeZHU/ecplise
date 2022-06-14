package com_POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_personaldetailspage {

	public static WebDriver driver;

	public POM_personaldetailspage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	@FindBy(xpath="//input[contains(@id,'FirstName')]")
	private WebElement input_firstname;
	@FindBy(xpath="//input[contains(@id,'eeId')]")
	private WebElement input_employeeid;
	@FindBy(xpath="//a[contains(@id,'PimMo')]")
	private WebElement menu_PIM;
	@FindBy(xpath="//a[contains(text(),'Employee List')]")
	private WebElement menu_employeelist;

	public WebElement getInput_firstname() {
		return input_firstname;
	}
	public WebElement getInput_employeeid() {
		return input_employeeid;
	}
	public WebElement getMenu_PIM() {
		return menu_PIM;
	}
	public WebElement getMenu_employeelist() {
		return menu_employeelist;
	}
	
}
