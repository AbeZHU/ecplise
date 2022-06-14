package com_POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_loginpage {

	public static WebDriver driver;
	public POM_loginpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement txt_username;	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement txt_password;
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement btn_login;
	@FindBy(xpath="//a[contains(text(),'orgot')]")
	private WebElement forgot_password;
	@FindBy(xpath="//a[contains(text(),'Orange')]")
	private WebElement orangeHRM_inc;
	@FindBy(xpath="//a[contains(@href,'linked')]")
	private WebElement href_linkedin;
	@FindBy(xpath="//a[contains(@href,'face')]")
	private WebElement href_facebook;
	@FindBy(xpath="//a[contains(@href,'twitter')]")
	private WebElement href_twitter;
	@FindBy(xpath="//a[contains(@href,'you')]")
	private WebElement href_youtube;
	public WebElement getTxt_username() {
		return txt_username;
	}
	public WebElement getTxt_password() {
		return txt_password;
	}
	public WebElement getBtn_login() {
		return btn_login;
	}
	public WebElement getForgot_password() {
		return forgot_password;
	}
	public WebElement getOrangeHRM_inc() {
		return orangeHRM_inc;
	}
	public WebElement getHref_linkedin() {
		return href_linkedin;
	}
	public WebElement getHref_facebook() {
		return href_facebook;
	}
	public WebElement getHref_twitter() {
		return href_twitter;
	}
	public WebElement getHref_youtube() {
		return href_youtube;
	}
	
}
