package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_homepage {
	public static WebDriver driver;
	public static String home = "http://adactinhotelapp.com/";

	

	public POM_homepage(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
	}

	@FindBy(xpath = "//a[text()='New User Register Here']")
	private WebElement newRegister;
	@FindBy(xpath = "(//input[@class='login_input'])[1]")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	private WebElement forgotPass;
	@FindBy(name = "login")
	private WebElement loginButton;
	@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[2]/td/ul/li[2]/a")
	private WebElement goToBuild2;
	@FindBy(xpath = "//a[text()='info@adactin.com']")
	private WebElement emailQuries;
	@FindBy(xpath = "//a[text()='Adactin.com']")
	private WebElement bottomLink;
	@FindBy(xpath = "//img[@src='img/ios-button.png']")
	private WebElement iosApp;
	@FindBy(xpath = "//img[@src='img/google-play.png']")
	private WebElement androidApp;

	public WebElement getNewRegister() {
		return newRegister;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getForgotPass() {
		return forgotPass;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getGoToBuild2() {
		return goToBuild2;
	}

	public WebElement getEmailQuries() {
		return emailQuries;
	}

	public WebElement getBottomLink() {
		return bottomLink;
	}

	public WebElement getIosApp() {
		return iosApp;
	}

	public WebElement getAndroidApp() {
		return androidApp;
	}

}
