package com_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_newuserlogin {
	public static String urlNewUser="http://adactinhotelapp.com/Register.php";
	public static WebDriver driver;
	
	public POM_newuserlogin(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement enterUserName;
	@FindBy(xpath="//input[@id='password']")
	private WebElement enterPasswrd;
	@FindBy(xpath="//input[@id='re_password']")
	private WebElement enterAgainPass;
	@FindBy(xpath="//input[@id='full_name']")
	private WebElement enterName;
	@FindBy(xpath="//input[@name='email_add']")
	private WebElement enterEmail;
	@FindBy(xpath="//img[@alt='Refresh Captcha']")
	private WebElement refreshCaptcha;
	@FindBy(xpath="//input[@id='captcha-form']")
	private WebElement enterCaptcha;
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	private WebElement termsAndConditon;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitRegister;
	@FindBy(xpath="//input[@value='Reset']")
	private WebElement resetFields;
	@FindBy(xpath="//a[contains(text(),'Go back to Logi')]")
	private WebElement backToLogin;
	@FindBy(xpath="(//a[text()='DOWNLOAD'])[1]")
	private WebElement mobileDownload;
	@FindBy(xpath="(//a[text()='DOWNLOAD'])[2]")
	private WebElement testCasesDwonload;
	@FindBy(xpath="(//a[text()='DOWNLOAD'])[3]")
	private WebElement defectsDownload;
	@FindBy(xpath="//iframe[contains(@src,'index.html')]")
	private WebElement frameForScroll;
	@FindBy(xpath="//a[@class='imgScrollBtn01_2']")
	private WebElement scrollLeft;
	@FindBy(xpath="//iframe[contains(@src,'index.html')]")
	private WebElement frameIn;
	@FindBy(xpath="//a[@class='imgScrollBtn02_2']")
	private WebElement scrollRight;
	public WebElement getEnterUserName() {
		return enterUserName;
	}
	public WebElement getEnterPasswrd() {
		return enterPasswrd;
	}
	public WebElement getEnterAgainPass() {
		return enterAgainPass;
	}
	public WebElement getEnterName() {
		return enterName;
	}
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	public WebElement getRefreshCaptcha() {
		return refreshCaptcha;
	}
	public WebElement getEnterCaptcha() {
		return enterCaptcha;
	}
	public WebElement getTermsAndConditon() {
		return termsAndConditon;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getSubmitRegister() {
		return submitRegister;
	}
	public WebElement getResetFields() {
		return resetFields;
	}
	public WebElement getBackToLogin() {
		return backToLogin;
	}
	public WebElement getMobileDownload() {
		return mobileDownload;
	}
	public WebElement getTestCasesDwonload() {
		return testCasesDwonload;
	}
	public WebElement getDefectsDownload() {
		return defectsDownload;
	}
	public WebElement getFrameForScroll() {
		return frameForScroll;
	}
	public WebElement getScrollLeft() {
		return scrollLeft;
	}
	public WebElement getFrameIn() {
		return frameIn;
	}
	public WebElement getScrollRight() {
		return scrollRight;
	}

}
