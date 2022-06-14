package com_POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_addemployee {

	public static WebDriver driver;

	public POM_addemployee(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement txt_firstname;
	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement txt_middlename;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement txt_lastname;
	@FindBy(xpath = "//input[@name='employeeId']")
	private WebElement get_employeeid;
	@FindBy(xpath = "//input[@id='photofile']")
	private WebElement upload_photo;
	@FindBy(xpath = "//input[@id='chkLogin']")
	private WebElement checkbox_createlogin;
	@FindBy(xpath = "//input[@id='user_name']")
	private WebElement txt_username;
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement txt_password;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement txt_confirmpassword;
	@FindBy(xpath = "//select[@name='status']")
	private WebElement select_status;
	@FindBy(xpath = "//span[contains(@id,'strength')]")
	private WebElement password_strength;
	@FindBy(xpath = "//input[contains(@id,'btnSave')]")
	private WebElement btn_save;

	public WebElement getTxt_firstname() {
		return txt_firstname;
	}

	public WebElement getTxt_middlename() {
		return txt_middlename;
	}

	public WebElement getTxt_lastname() {
		return txt_lastname;
	}

	public WebElement getGet_employeeid() {
		return get_employeeid;
	}

	public WebElement getUpload_photo() {
		return upload_photo;
	}

	public WebElement getCheckbox_createlogin() {
		return checkbox_createlogin;
	}

	public WebElement getTxt_username() {
		return txt_username;
	}

	public WebElement getTxt_password() {
		return txt_password;
	}

	public WebElement getTxt_confirmpassword() {
		return txt_confirmpassword;
	}

	public WebElement getSelect_status() {
		return select_status;
	}

	public WebElement getPassword_strength() {
		return password_strength;
	}

	public WebElement getBtn_save() {
		return btn_save;
	}

}
