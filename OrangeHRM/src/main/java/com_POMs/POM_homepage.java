package com_POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_homepage {
	public static WebDriver driver;
	public POM_homepage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath="(//a[contains(@id,'Pim')])[1]")
	private WebElement menu_PIM;
	@FindBy(xpath="//a[contains(@id,'addEm')]")
	private WebElement dd_AddEmployee;
	public WebElement getMenu_PIM() {
		return menu_PIM;
	}
	public WebElement getDd_AddEmployee() {
		return dd_AddEmployee;
	}
	

}
