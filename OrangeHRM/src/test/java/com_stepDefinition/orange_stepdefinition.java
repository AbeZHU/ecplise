package com_stepDefinition;

import org.openqa.selenium.WebDriver;

import com_FileManager.Com_File;
import com_POM_manager.Com_Pom;
import com_baseclass.Class_Base;
import com_runner.Orange_runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orange_stepdefinition {
	public static WebDriver driver = Orange_runner.driver;

	@Given("user is in the login page of OrangeHRM")
	public void user_is_in_the_login_page_of_orange_hrm() {
		Class_Base.manager().get(Com_File.manager().getInstance_Login_config().getUrl());

	}

	@When("user enter the user name and password")
	public void user_enter_the_user_name_and_password() {
		Class_Base.manager().sendKeys(Com_Pom.manager().getLoginpg().getTxt_username(),Com_File.manager().getInstance_Login_config().getUsername());
		Class_Base.manager().sendKeys(Com_Pom.manager().getLoginpg().getTxt_password(),Com_File.manager().getInstance_Login_config().getPassword());
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
		Class_Base.manager().clickElement(Com_Pom.manager().getLoginpg().getBtn_login());
	}

	@Then("navigated to the Dashboard page")
	public void navigated_to_the_dashboard_page() {
		Com_Pom.manager().getHomepg().getMenu_PIM().isDisplayed();
	}

	@When("user click on Add employee in PIM tree")
	public void user_click_on_add_employee_in_pim_tree() {
		Class_Base.manager().moveTo(Com_Pom.manager().getHomepg().getMenu_PIM());
		Class_Base.manager().clickElement(Com_Pom.manager().getHomepg().getDd_AddEmployee());
	}

	@Then("navigated to the add Employee page")
	public void navigated_to_the_add_employee_page() {
		Com_Pom.manager().getAddemp().getTxt_confirmpassword().isDisplayed();

	}

	@Given("user is in the add employee page")
	public void user_is_in_the_add_employee_page() {
		System.out.println("succeeded");
	}

	@When("user enters the first, middle, last name")
	public void user_enters_the_first_middle_last_name() throws InterruptedException {
		Class_Base.manager().sendKeys(Com_Pom.manager().getAddemp().getTxt_firstname(),Com_File.manager().getInstance_AddEmployee_config().getFullname());
		Class_Base.manager().sendKeys(Com_Pom.manager().getAddemp().getTxt_middlename(),Com_File.manager().getInstance_AddEmployee_config().getMiddlename());
		Class_Base.manager().sendKeys(Com_Pom.manager().getAddemp().getTxt_lastname(),Com_File.manager().getInstance_AddEmployee_config().getLastname());
		Class_Base.manager().getValue(Com_Pom.manager().getAddemp().getGet_employeeid());
		// Thread.sleep(5000);
	}

	@And("user chooses photograph")
	public void user_chooses_photograph() {
		Class_Base.manager().sendKeys(Com_Pom.manager().getAddemp().getUpload_photo(),Com_File.manager().getInstance_AddEmployee_config().getPhotopath());
	}

	@And("user creates login details")
	public void user_creates_login_details() {
		Class_Base.manager().clickElement(Com_Pom.manager().getAddemp().getCheckbox_createlogin());
		Class_Base.manager().sendKeys(Com_Pom.manager().getAddemp().getTxt_username(),Com_File.manager().getInstance_AddEmployee_config().getUsername());
		Class_Base.manager().sendKeys(Com_Pom.manager().getAddemp().getTxt_password(),Com_File.manager().getInstance_AddEmployee_config().getPassword());
		Class_Base.manager().sendKeys(Com_Pom.manager().getAddemp().getTxt_confirmpassword(),Com_File.manager().getInstance_AddEmployee_config().getPassword());
	}

	@And("user clicks on submit")
	public void user_clicks_on_submit() {
		Class_Base.manager().clickElement(Com_Pom.manager().getAddemp().getBtn_save());
	}

	@Then("navigated to the Personl details page")
	public void navigated_to_the_personl_details_page() {
		Com_Pom.manager().getPerdetails().getInput_firstname().isDisplayed();
	}

	@Given("user clicks on employee list on PIM dropdown")
	public void user_clicks_on_employee_list_on_pim_dropdown() {
		Class_Base.manager().moveTo(Com_Pom.manager().getPerdetails().getMenu_PIM());
		Class_Base.manager().clickElement(Com_Pom.manager().getPerdetails().getMenu_employeelist());
	}

	@And("user is in employee list page")
	public void user_is_in_employee_list_page() {
		System.out.println("yay");
	}

	@When("user enters the details on search fields")
	public void user_enters_the_details_on_search_fields() {
		Class_Base.manager().sendKeys(Com_Pom.manager().getEmplist().getTxt_employeeid(),Class_Base.manager().value1);
		Class_Base.manager().clickElement(Com_Pom.manager().getEmplist().getBtn_search());
	}

	@Then("validate the information given there")
	public void validate_the_information_given_there() {
		Class_Base.manager().clickElement(Com_Pom.manager().getEmplist().getCheckbox());
		Class_Base.manager().clickElement(Com_Pom.manager().getEmplist().getDelete_btn());
		Class_Base.manager().clickElement(Com_Pom.manager().getEmplist().getOk_btn());
	}

}
