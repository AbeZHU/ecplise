package com_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_selecthotel {
	public static WebDriver driver;
	public static String url = "http://adactinhotelapp.com/SelectHotel.php";

	public POM_selecthotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> radiobutton;

	@FindBy(id = "continue")
	private WebElement submit;

	@FindBy(id = "cancel")
	private WebElement cancel;

	@FindBy(xpath = "//a[text()='Search Hotel']")
	private WebElement searchHotelLink;
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bookedItienary;
	@FindBy(xpath = "//a[text()='Change Password']")
	private WebElement changePassword;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logOutLink;

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getSearchHotelLink() {
		return searchHotelLink;
	}

	public WebElement getBookedItienary() {
		return bookedItienary;
	}

	public WebElement getChangePassword() {
		return changePassword;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}

	public List<WebElement> getRadiobutton() {
		return radiobutton;
	}

}
