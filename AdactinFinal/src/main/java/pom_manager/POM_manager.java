package pom_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com_POM.POM_bookahotel;
import com_POM.POM_bookeditinarary;
import com_POM.POM_bookingconfirm;
import com_POM.POM_forgotpassword;
import com_POM.POM_homepage;
import com_POM.POM_logoutpage;
import com_POM.POM_newuserlogin;
import com_POM.POM_searchhotel;
import com_POM.POM_selecthotel;

public class POM_manager {
	public static WebDriver driver;
	private POM_homepage homepg;
	private POM_newuserlogin newlog;
	private POM_searchhotel hotelsearch;
	private POM_selecthotel selecthotel;
	private POM_forgotpassword forgotpass;
	private POM_bookeditinarary itin;
	private POM_bookingconfirm confirmBooking;
	private POM_logoutpage logout;
	private POM_bookahotel bookhotel;

	


	public POM_manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public POM_bookahotel getBookhotel() {
		bookhotel = new POM_bookahotel(driver);
		return bookhotel;
	}

	public POM_bookeditinarary getItin() {
		itin = new POM_bookeditinarary(driver);
		return itin;
	}

	public POM_bookingconfirm getConfirm() {
		confirmBooking = new POM_bookingconfirm(driver);
		return confirmBooking;
	}

	public POM_logoutpage getLogout() {
		logout = new POM_logoutpage(driver);
		return logout;
	}

	public POM_newuserlogin getNewlog() {
		newlog = new POM_newuserlogin(driver);
		return newlog;
	}

	public POM_searchhotel getHotelsearch() {
		hotelsearch = new POM_searchhotel(driver);
		return hotelsearch;
	}

	public POM_selecthotel getSelecthotel() {
		selecthotel = new POM_selecthotel(driver);
		return selecthotel;
	}

	public POM_forgotpassword getForgotpass() {
		forgotpass = new POM_forgotpassword(driver);
		return forgotpass;
	}

	public POM_homepage getHomepg() {
		homepg = new POM_homepage(driver);
		return homepg;
	}



}
