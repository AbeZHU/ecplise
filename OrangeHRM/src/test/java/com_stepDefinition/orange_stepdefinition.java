package com_stepDefinition;

import org.openqa.selenium.WebDriver;

import com_FileManager.Com_filemanager;
import com_POM_manager.Manager_pom;
import com_baseclass.BaseClass;
import com_runner.Orange_runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orange_stepdefinition {
	public static WebDriver driver = Orange_runner.driver;

	@Given("user is in the login page of OrangeHRM")
	public void user_is_in_the_login_page_of_orange_hrm() {
		BaseClass.functionModifier().get(Com_filemanager.getInstance().getInstance_Login_config().getUrl());

	}

	@When("user enter the user name and password")
	public void user_enter_the_user_name_and_password() {
		BaseClass.functionModifier().sendKeys(Manager_pom.manage().getLoginpg().getTxt_username(),
				Com_filemanager.getInstance().getInstance_Login_config().getUsername());
		BaseClass.functionModifier().sendKeys(Manager_pom.manage().getLoginpg().getTxt_password(),
				Com_filemanager.getInstance().getInstance_Login_config().getPassword());
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
		BaseClass.functionModifier().clickElement(Manager_pom.manage().getLoginpg().getBtn_login());
	}

	@Then("navigated to the Dashboard page")
	public void navigated_to_the_dashboard_page() {
		Manager_pom.manage().getHomepg().getMenu_PIM().isDisplayed();
	}

	@When("user click on Add employee in PIM tree")
	public void user_click_on_add_employee_in_pim_tree() {
		BaseClass.functionModifier().moveTo(Manager_pom.manage().getHomepg().getMenu_PIM());
		BaseClass.functionModifier().clickElement(Manager_pom.manage().getHomepg().getDd_AddEmployee());
	}

	@Then("navigated to the add Employee page")
	public void navigated_to_the_add_employee_page() {
		Manager_pom.manage().getAddemp().getTxt_confirmpassword().isDisplayed();

	}

	@Given("user is in the add employee page")
	public void user_is_in_the_add_employee_page() {
		System.out.println("succeeded");
	}

	@When("user enters the first, middle, last name")
	public void user_enters_the_first_middle_last_name() throws InterruptedException {
		BaseClass.functionModifier().sendKeys(Manager_pom.manage().getAddemp().getTxt_firstname(),
				Com_filemanager.getInstance().getInstance_AddEmployee_config().getFullname());
		BaseClass.functionModifier().sendKeys(Manager_pom.manage().getAddemp().getTxt_middlename(),
				Com_filemanager.getInstance().getInstance_AddEmployee_config().getMiddlename());
		BaseClass.functionModifier().sendKeys(Manager_pom.manage().getAddemp().getTxt_lastname(),
				Com_filemanager.getInstance().getInstance_AddEmployee_config().getLastname());
		BaseClass.functionModifier().getValue(Manager_pom.manage().getAddemp().getGet_employeeid());
		// Thread.sleep(5000);
	}

	@And("user chooses photograph")
	public void user_chooses_photograph() {
		BaseClass.functionModifier().sendKeys(Manager_pom.manage().getAddemp().getUpload_photo(),
				Com_filemanager.getInstance().getInstance_AddEmployee_config().getPhotopath());
	}

	@And("user creates login details")
	public void user_creates_login_details() {
		BaseClass.functionModifier().clickElement(Manager_pom.manage().getAddemp().getCheckbox_createlogin());
		BaseClass.functionModifier().sendKeys(Manager_pom.manage().getAddemp().getTxt_username(),
				Com_filemanager.getInstance().getInstance_AddEmployee_config().getUsername());
		BaseClass.functionModifier().sendKeys(Manager_pom.manage().getAddemp().getTxt_password(),
				Com_filemanager.getInstance().getInstance_AddEmployee_config().getPassword());
		BaseClass.functionModifier().sendKeys(Manager_pom.manage().getAddemp().getTxt_confirmpassword(),
				Com_filemanager.getInstance().getInstance_AddEmployee_config().getPassword());
	}

	@And("user clicks on submit")
	public void user_clicks_on_submit() {
		BaseClass.functionModifier().clickElement(Manager_pom.manage().getAddemp().getBtn_save());
	}

	@Then("navigated to the Personl details page")
	public void navigated_to_the_personl_details_page() {
		Manager_pom.manage().getPerdetails().getInput_firstname().isDisplayed();
	}

	@Given("user clicks on employee list on PIM dropdown")
	public void user_clicks_on_employee_list_on_pim_dropdown() {
		BaseClass.functionModifier().moveTo(Manager_pom.manage().getPerdetails().getMenu_PIM());
		BaseClass.functionModifier().clickElement(Manager_pom.manage().getPerdetails().getMenu_employeelist());
	}

	@And("user is in employee list page")
	public void user_is_in_employee_list_page() {
		System.out.println("yay");
	}

	@When("user enters the details on search fields")
	public void user_enters_the_details_on_search_fields() {
		BaseClass.functionModifier().sendKeys(Manager_pom.manage().getEmplist().getTxt_employeeid(),
				BaseClass.functionModifier().value1);
		BaseClass.functionModifier().clickElement(Manager_pom.manage().getEmplist().getBtn_search());
	}

	@Then("validate the information given there")
	public void validate_the_information_given_there() {
		BaseClass.functionModifier().clickElement(Manager_pom.manage().getEmplist().getCheckbox());
		BaseClass.functionModifier().clickElement(Manager_pom.manage().getEmplist().getDelete_btn());
		BaseClass.functionModifier().clickElement(Manager_pom.manage().getEmplist().getOk_btn());
	}

}
