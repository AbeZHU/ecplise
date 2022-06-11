package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_searchhotel {

	public static String urlSearch="http://adactinhotelapp.com/SearchHotel.php";
	public static WebDriver driver;
		
	public POM_searchhotel(WebDriver driver2) {
		PageFactory.initElements(driver2, this);
	}
	@FindBy(xpath = "//select[@name='location']")
	private WebElement enterLocation;
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement enterHotel;
	@FindBy(id ="room_type")
	private WebElement selectRoom;
	@FindBy(id="room_nos")
	private WebElement roomNo;
	@FindBy(xpath="(//input[@class='date_pick'])[1]")
	private WebElement checkInDate;
	@FindBy(xpath="(//input[@class='date_pick'])[2]")
	private WebElement checkOutDate;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement noOfAdults;
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement noOfChild;
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement submitForm;
	@FindBy(xpath="//input[@name='Reset']")
	private WebElement resetForm;
	@FindBy(xpath="//a[text()='Search Hotel']")
	private WebElement searchHotelLink;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedItienary;
	@FindBy(xpath="//a[text()='Change Password']")
	private WebElement changePassword;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOutLink;
	public WebElement getEnterLocation() {
		return enterLocation;
	}
	public WebElement getEnterHotel() {
		return enterHotel;
	}
	public WebElement getSelectRoom() {
		return selectRoom;
	}
	public WebElement getRoomNo() {
		return roomNo;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getNoOfAdults() {
		return noOfAdults;
	}
	public WebElement getNoOfChild() {
		return noOfChild;
	}
	public WebElement getSubmitForm() {
		return submitForm;
	}
	public WebElement getResetForm() {
		return resetForm;
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
	
}
