package steps;

import base.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.FormPage;
import pages.HomePage;

public class AddNewFormSteps extends CommonMethods {
    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();
    FormPage formPage = new FormPage();

    @When("user click on Forms link")
    public void user_click_on_forms_link() {
        accountPage.hoveOnHome();
        formPage.ClickOnLink("Forms");

    }

    @When("user click on Add")
    public void user_click_on_add() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enter form's name")
    public void user_enter_form_s_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user check Active option")
    public void user_check_active_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enter Introduction text")
    public void user_enter_introduction_text() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click save button")
    public void user_click_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("new form will be created")
    public void new_form_will_be_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}