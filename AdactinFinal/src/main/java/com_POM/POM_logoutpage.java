package com_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_logoutpage {
	public  static WebDriver driver;
		public POM_logoutpage(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
	}
	@FindBy(xpath="//td[text()='You have successfully logged out. ']")
	private WebElement logoutrant;

	public WebElement getLogoutrant() {
		return logoutrant;
	}



}
