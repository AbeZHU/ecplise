package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_bookahotel {
	public static WebDriver driver;
	public POM_bookahotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	@FindBy(xpath="//a[text()='Back']")
	private WebElement backButton;
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement billingAddress;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement creditCardNo;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement selectCCtype;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement selectExpMonth;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement selectYear;
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvvNumber;
	@FindBy(xpath="//input[@value='Book Now']")
	private WebElement bookNow;
	@FindBy(xpath="//input[@value='Cancel']")
	private WebElement cancel;
	public WebElement getBackButton() {
		return backButton;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	public WebElement getSelectCCtype() {
		return selectCCtype;
	}
	public WebElement getSelectExpMonth() {
		return selectExpMonth;
	}
	public WebElement getSelectYear() {
		return selectYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public WebElement getCancel() {
		return cancel;
	}
	

}
