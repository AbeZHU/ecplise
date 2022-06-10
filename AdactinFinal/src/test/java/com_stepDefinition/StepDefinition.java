package com_stepDefinition;

import org.openqa.selenium.WebDriver;

import com_Runner.Runner_com;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_manager.POM_manager;
import com_baseclass.BaseClass;
import com_baseclass.BaseClass_com;

public class StepDefinition  {
	public static WebDriver driver = Runner_com.driver;
	public static POM_manager man = new POM_manager(driver);
	BaseClass bc = new BaseClass();

	@Given("user is in home page")
	public void user_is_in_home_page() {
		bc.get(man.getHomepg().home);
	}

	@When("user enters username and password in respective fields")
	public void user_enters_username_and_password_in_respective_fields() {
		bc.sendKeys(man.getHomepg().getUsername(), "justademo1");
		bc.sendKeys(man.getHomepg().getPassword(), "123pass");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		bc.clickElement(man.getHomepg().getLoginButton());
	}

	@Then("user is navigated to the search hotel page")
	public void user_is_navigated_to_the_search_hotel_page() {
		man.getHotelsearch().getEnterLocation().isDisplayed();
	}

	@Given("user is in search hotel page")
	public void user_is_in_search_hotel_page() {
		System.out.println("search hotel page");
	}

	@When("user enters the needed fields of the search")
	public void user_enters_the_needed_fields_of_the_search() {
		bc.dropdown(man.getHotelsearch().getEnterLocation(), "Melbourne");
		bc.dropdown(man.getHotelsearch().getEnterHotel(), "Hotel Hervey");
		bc.dropdown(man.getHotelsearch().getSelectRoom(), "Double");
		bc.dropdown(man.getHotelsearch().getRoomNo(), "2");
		bc.sendKeys(man.getHotelsearch().getCheckInDate(), "21/06/2022");
		bc.sendKeys(man.getHotelsearch().getCheckOutDate(), "23/06/2022");
		bc.dropdown(man.getHotelsearch().getNoOfAdults(), "2");
		bc.dropdown( man.getHotelsearch().getNoOfChild(),"2");
		}

	@And("user clciks submits")
	public void user_clciks_submits() {
		bc.clickElement(man.getHotelsearch().getSubmitForm());
	}

	@Then("user navigated to the select hotel page")
	public void user_navigated_to_the_select_hotel_page() {
		man.getSelecthotel().getSubmit().isDisplayed();
	}

	@Given("user is in the hotel selection page")
	public void user_is_in_the_hotel_selection_page() {
		System.out.println("select hotel page");
	}

	@When("user selects the hotel")
	public void user_selects_the_hotel() {
		bc.radioButton(man.getSelecthotel().getRadiobutton(), 0);
	}

	@And("user clicks on continue")
	public void user_clicks_on_continue() {
		bc.clickElement(man.getSelecthotel().getSubmit());
	}

	@Then("user is navigated to the Book Hotel page")
	public void user_is_navigated_to_the_book_hotel_page() {
		man.getBookhotel().getBillingAddress().isDisplayed();
	}

	@Given("user is in info entering page")
	public void user_is_in_info_entering_page() {
		System.out.println("user is booking a hotel");
	}

	@When("user enters the necessary fields")
	public void user_enters_the_necessary_fields() {
		bc.sendKeys(man.getBookhotel().getFirstName(), "klark");
		bc.sendKeys(man.getBookhotel().getLastName(), "dent");
		bc.sendKeys(man.getBookhotel().getBillingAddress(), "no.1 , metropolis 1st cross street, metropolis, Pc universe");
		bc.sendKeys(man.getBookhotel().getCreditCardNo(), "1234567812347890");
		bc.dropdown(man.getBookhotel().getSelectCCtype(), "VISA");
		bc.dropdown(man.getBookhotel().getSelectExpMonth(), "5");
		bc.dropdown(man.getBookhotel().getSelectYear(), "2022");
		bc.sendKeys(man.getBookhotel().getCvvNumber(), "009");
	}

	@And("user clicks on Book now")
	public void user_clicks_on_book_now() {
		bc.clickElement(man.getBookhotel().getBookNow());
	}

	@Then("user is navigated to Conformation page")
	public void user_is_navigated_to_conformation_page() {
	man.getConfirm().getMy_itinerary().isDisplayed();
	}

	@Given("user need to log out")
	public void user_need_to_log_out() {
		System.out.println("user proceeds to logout");
	}

	@When("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		bc.clickElement(man.getConfirm().getLogout());
	}

	@Then("user is navigated to log out page")
	public void user_is_navigated_to_log_out_page() {
		man.getLogout().getLogoutrant().isDisplayed();
	}

}
