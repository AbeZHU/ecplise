package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_forgotpassword {
	public static String url="http://adactinhotelapp.com/ForgotPassword.php";
	public static WebDriver driver;
	
	public POM_forgotpassword(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
	}
	@FindBy(xpath="//input[@id='emailadd_recovery']")
	private WebElement enterEmail;
	@FindBy(xpath="//input[@value='Email Password']")
	private WebElement enterEmailPassword;
	@FindBy(xpath="//input[@id='Reset']")
	private WebElement reset;
	@FindBy(xpath="//a[contains(text(),'back to')]")
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
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	public WebElement getEnterEmailPassword() {
		return enterEmailPassword;
	}
	public WebElement getReset() {
		return reset;
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
	public WebElement getFrameIn() {
		return frameIn;
	}
	public WebElement getFrameForScroll() {
		return frameForScroll;
	}
	public WebElement getScrollLeft() {
		return scrollLeft;
	}
	public WebElement getScrollRight() {
		return scrollRight;
	}

}
